package busca_largura;

import lista_adjacencia.GrafoListaAdjacencia;

public class BuscaLargura {
    private Cor cor [];
    private Integer distancia [];
    private Integer pai [];

    public void buscar(GrafoListaAdjacencia g, int s){

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
        while (fila.getPrimeiro() != null){
            fila.removerInicio();
            for (int v = 0; v < g.listaSecundariaAdjacencia.size(); v++) {
                if (cor[v] == Cor.WHITE){
                    cor[v] = Cor.GRAY;
                    distancia[v] = distancia[u] + 1;
                    pai[v] = u;
                    fila.inserirFinal(v);
                }
            }
            cor[u] = Cor.BLACK;
        }
    }

    public void imprimir(){
        System.out.println("COR");
        for (int i = 0; i < cor.length; i++) {
            System.out.println("cor["+i+"] = "+ cor[i]);
        }
        System.out.println("DISTANCIA");
        for (int i = 0; i < distancia.length; i++) {
            System.out.println("distancia["+i+"] = "+ distancia[i]);
        }
        System.out.println("PAI");
        for (int i = 0; i < pai.length; i++) {
            System.out.println("pai["+i+"] = "+ pai[i]);
        }
    }

}
