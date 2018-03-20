package lista_indexada;

import java.util.Scanner;

public class GrafoListaIndexada {
    Scanner scanner = new Scanner(System.in);

    ListaIndexada listaIndexada = new ListaIndexada();

    public void listaOrientadaPoderada() {
        int op = 0;
        int pos = 0;
        while (op == 0) {
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            listaIndexada.inserirFinal(valor);
            System.out.println("Continuar - 0 | Sair - 1");
            op = scanner.nextInt();
        }
        NoIndexada aux = listaIndexada.getPrimeiro();
        while (aux != null) {
            ListaSecundariaIndexada listaSecundariaIndexada = new ListaSecundariaIndexada();
            System.out.println("Esse vertice " + aux.getValorGrafo() + " aponta para quantos outros?");
            int qtde = scanner.nextInt();
            int cont = 1;
            while (cont <= qtde) {
                if (cont == 1) {
                    pos++;
                    aux.setPosInicio(pos);
                    pos += (qtde - 1);
                    aux.setFim(pos);
                }
                System.out.println("Inserir vertice: ");
                int valorListaMatriz = scanner.nextInt();
                while (!listaIndexada.buscarVertice(valorListaMatriz)) {
                    System.err.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }
                listaSecundariaIndexada.inserirFinal(valorListaMatriz);
                cont++;
            }
            aux.setListaSecundariaIndexada(listaSecundariaIndexada);
            aux = aux.getProx();
        }
    }

    public void imprimirLista() {
        listaIndexada.exibir();
    }
}
