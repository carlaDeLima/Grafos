package busca_profundidade;

import lista_adjacencia.GrafoListaAdjacencia;
import lista_adjacencia.ListaAdjacencia;
import lista_adjacencia.ListaSecundariaAdjacencia;
import lista_adjacencia.NoListaSecundariaAdjacencia;

public class BuscaProfundidade {
    private Cor cor[];
    private Integer pai[];
    private Integer tempo;
    private Integer tempoInicial[];
    private Integer tempoFinal[];
    private GrafoListaAdjacencia grafoAux;

    public void buscar(GrafoListaAdjacencia g, int verticeIncial){
        grafoAux = g;
        //verticeIncial = verticeIncial - 1;

        cor = new Cor[g.size()];
        pai = new Integer[g.size()];
        tempoInicial = new Integer[g.size()];
        tempoFinal = new Integer[g.size()];

        for (int i = 0; i < g.size(); i++) {
            cor[i] = Cor.WHITE;
            pai[i] = null;
        }
        tempo = 0;
        for (int i = 0; i < g.size(); i++) {
            if (cor[i] == Cor.WHITE){
                DFS_VISIT(i);
            }
        }
        imprimir();
    }

    private void DFS_VISIT(Integer i){
        cor[i] = Cor.GRAY;
        tempo++;
        tempoInicial[i] = tempo;
        ListaAdjacencia listaAdjacencia = grafoAux.lista;
        ListaSecundariaAdjacencia listaSecundariaAdjacencia = listaAdjacencia
                .buscarListaSecundaria(i + 1);

        NoListaSecundariaAdjacencia aux = listaSecundariaAdjacencia.getPrimeiro();
        while (aux != null) {
            if (cor[aux.getValor() - 1] == Cor.WHITE){
                pai[aux.getValor() - 1] = i + 1;
                DFS_VISIT(aux.getValor() - 1);
            }
            aux = aux.getProx();
        }
        cor[i] = Cor.BLACK;
        tempoFinal[i] = tempo + 1;
        tempo++;
    }

    private void imprimir(){
        System.out.print("C\t|\t");
        for (int i = 0; i < cor.length; i++) {
            System.out.print(cor[i] + "\t|\t");
        }
        System.out.println();
        System.out.print("P\t|\t");
        for (int i = 0; i < pai.length; i++) {
            //System.out.print("pai[" + i + "] = " + pai[i] + "\t");
            System.out.print(pai[i] + "\t|\t");
        }
        System.out.println();
        System.out.print("I\t|\t");
        for (int i = 0; i < tempoInicial.length; i++) {
            System.out.print(tempoInicial[i] + "\t|\t");
        }
        System.out.println();
        System.out.print("F\t|\t");
        for (int i = 0; i < tempoFinal.length; i++) {
            System.out.print(tempoFinal[i] + "\t|\t");
        }
        System.out.println();

    }
}
