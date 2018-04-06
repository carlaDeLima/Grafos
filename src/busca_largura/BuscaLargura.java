package busca_largura;

import lista_adjacencia.GrafoListaAdjacencia;

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
        cor[s] = Cor.GRAY;
        distancia[s] = 0;
        pai[s] = null;
        fila.inserirFinal(s);
       /* //g.lista.buscarVerticeNumero(s, g.lista.getPrimeiro().getValor());
        while (fila.getPrimeiro() != null) {
            int aux = fila.getPrimeiro().getValor();

            fila.removerInicio();
            for (int v = 0; v < g.listaSecundariaAdjacencia.size(); v++) {
//                g.lista.buscarVerticeNumero(aux,);
//                if (v+1)
                if (cor[v] == Cor.WHITE) {
                    cor[v] = Cor.GRAY;
                    distancia[v] = distancia[u] + 1;
                    pai[v] = u;
                    fila.inserirFinal(v);
                }
            }
            cor[u] = Cor.BLACK;
        }*/
        imprimir(g);
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
