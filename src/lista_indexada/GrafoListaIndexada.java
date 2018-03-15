package lista_indexada;

import java.util.Scanner;

public class GrafoListaIndexada {
    Scanner scanner = new Scanner(System.in);

    ListaIndexada lista =  new ListaIndexada();

    public void listaOrientadaPoderada(){
        int op = 0;
        while(op == 0){
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            lista.inserirFinal(valor, 1);
            System.out.println("Continuar - 0\nSair - 1");
            op = scanner.nextInt();
        }
        NoIndexada aux = lista.getPrimeiro();
        while (aux != null) {
            ListaSecundariaIndexada listaSecundariaIndexada = new ListaSecundariaIndexada();
            System.out.println("Esse vertice " + aux.getValorGrafo() + " aponta para quantos outros?");
            int qtde = scanner.nextInt();
            while (qtde > 0) {
                System.out.println("Inserir vertice: ");
                int valorListaMatriz = scanner.nextInt();
                while(!lista.buscarVertice(valorListaMatriz)){
                    System.out.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }
                listaSecundariaIndexada.inserirFinal(valorListaMatriz);
                qtde--;
            }
            aux.setListaSecundariaIndexada(listaSecundariaIndexada);
            aux = aux.getProx();
        }
    }

    public void imprimirLista(){
        lista.exibir();
    }
}
