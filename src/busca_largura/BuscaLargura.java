package busca_largura;

import lista_adjacencia.*;

public class BuscaLargura {
    private Cor cor[];
    private Integer distancia[];
    private Integer pai[];
    private GrafoListaAdjacencia grafoAux;

    public void buscar(GrafoListaAdjacencia g, int verticeIncial) {

        grafoAux = g;
        verticeIncial = verticeIncial - 1;

        cor = new Cor[g.size()];
        distancia = new Integer[g.size()];
        pai = new Integer[g.size()];

        Fila fila = new Fila();
        for (int i = 0; i < g.size(); i++) {
            cor[i] = Cor.WHITE;
            distancia[i] = Integer.MAX_VALUE;
            pai[i] = null;
        }

        imprimir(g);

        cor[verticeIncial] = Cor.GRAY;
        distancia[verticeIncial] = 0;
        pai[verticeIncial] = null;

        imprimir(g);

        fila.inserirFinal(verticeIncial);

        while (fila.getPrimeiro() != null) {
            int auxValor = fila.getPrimeiro().getValor();
            ListaAdjacencia listaAdjacencia = grafoAux.lista;
            ListaSecundariaAdjacencia listaSecundariaAdjacencia = listaAdjacencia
                    .buscarListaSecundaria(auxValor + 1);
            fila.removerInicio();
            NoListaSecundariaAdjacencia aux = listaSecundariaAdjacencia.getPrimeiro();
            while (aux != null) {
                if (cor[aux.getValor() - 1] == Cor.WHITE) {
                    cor[aux.getValor() - 1] = Cor.GRAY;
                    distancia[aux.getValor() - 1] = distancia[auxValor] + 1;
                    pai[aux.getValor() - 1] = auxValor + 1;
                    fila.inserirFinal(aux.getValor() - 1);
                }
                aux = aux.getProx();

                imprimir(g);
            }
            cor[auxValor] = Cor.BLACK;
        }

        imprimir(g);
    }

    private void imprimir(GrafoListaAdjacencia gAux) {
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