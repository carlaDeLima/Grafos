package busca_largura;

import lista_adjacencia.*;

public class BuscaLargura {
    private Cor cor[];
    private Integer distancia[];
    private Integer pai[];
    private GrafoListaAdjacencia grafoAux;

    public void buscar(GrafoListaAdjacencia g, int s) {

        grafoAux = g;
        s = s - 1;

        cor = new Cor[g.size()];
        distancia = new Integer[g.size()];
        pai = new Integer[g.size()];

        Fila fila = new Fila();
        int u;
        for (u = 0; u < g.size(); u++) {
            cor[u] = Cor.WHITE;
            distancia[u] = Integer.MAX_VALUE;
            pai[u] = null;
        }
        imprimir(g);
        cor[s] = Cor.GRAY;
        distancia[s] = 0;
        pai[s] = null;
        imprimir(g);
        fila.inserirFinal(s);
        while (fila.getPrimeiro() != null) {
            int auxValor = fila.getPrimeiro().getValor();
            ListaAdjacencia listaAdjacencia = grafoAux.lista;
            ListaSecundariaAdjacencia listaSecundariaAdjacencia = listaAdjacencia
                    .buscarListaSecundaria(auxValor);
            fila.removerInicio();
            NoListaSecundariaAdjacencia aux = listaSecundariaAdjacencia.getPrimeiro();
            while (aux != null) {
                if (cor[aux.getValor().getValor()] == Cor.WHITE) {
                    cor[aux.getValor().getValor()] = Cor.GRAY;
                    distancia[aux.getValor().getValor()] = distancia[auxValor] + 1;
                    pai[aux.getValor().getValor()] = auxValor + 1;
                    fila.inserirFinal(aux.getValor().getValor());
                }
                aux = aux.getProx();
                imprimir(g);
            }
            cor[auxValor] = Cor.BLACK;
        }
        //imprimir(g);
    }

    public void imprimir(GrafoListaAdjacencia gAux) {
        gAux.imprimirListaBusca();
        System.out.println();
        System.out.print("C\t|\t");
        for (int i = 0; i < cor.length; i++) {
            System.out.print(cor[i] + "\t|\t");
        }
        System.out.println();
        System.out.print("D\t|\t");
        for (int i = 0; i < distancia.length; i++) {
            if (distancia[i] == Integer.MAX_VALUE) {
                //System.out.print("dis[" + i + "] = INF\t");
                System.out.print("INF\t\t|\t");
            } else {
                //System.out.print("dis[" + i + "] = " + distancia[i] + "\t");
                System.out.print(distancia[i] + "\t\t|\t");
            }
        }
        System.out.println();
        System.out.print("P\t|\t");
        for (int i = 0; i < pai.length; i++) {
            //System.out.print("pai[" + i + "] = " + pai[i] + "\t");
            System.out.print(pai[i] + "\t|\t");
        }
        System.out.println();
    }

}
//      1       2       3       4       5
//C     B       B       B       B       B
//D     2       1       0       1       2
//P     2       3       N       3       2
