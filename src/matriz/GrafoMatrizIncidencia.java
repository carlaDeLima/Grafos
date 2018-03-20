package matriz;

import java.util.Scanner;

public class GrafoMatrizIncidencia {
    Scanner scanner = new Scanner(System.in);

    private int qtdeVertice;
    private int qtdeArestas;
    private int[][] matrizAdjacencia;

    public void matrizNaoOrientada() {
        pegarInformacao();
        matrizAdjacencia = new int[qtdeVertice][qtdeArestas];// vertice | aresta
        for (int i = 0; i < qtdeVertice; i++) {
            for (int j = 0; j < qtdeArestas; j++) {
                System.out.printf("Vertice %d se liga com a aresta %d\n", i + 1, j + 1);
                System.out.println("s - sim | n - não");
                char op = scanner.next().charAt(0);
                switch (op) {
                    case 's':
                        matrizAdjacencia[i][j] = 1;
                        break;
                    case 'n':
                        matrizAdjacencia[i][j] = 0;
                        break;
                }

            }
        }
    }

    public void matrizOrientada() {
        pegarInformacao();
        matrizAdjacencia = new int[qtdeVertice][qtdeArestas];// vertice | aresta
        for (int i = 0; i < qtdeVertice; i++) {
            for (int j = 0; j < qtdeArestas; j++) {
                if (matrizAdjacencia[i][j] == 0) {
                    System.out.printf("Vertice %d parte para outro vertice com  a aresta %d?\n", i + 1, j + 1);
                    System.out.println("s - sim | n - não");
                    char op = scanner.next().charAt(0);
                    switch (op) {
                        case 's':
                            matrizAdjacencia[i][j] = 1;
                            System.out.println("Informe o vertice?");
                            int vertice = scanner.nextInt();
                            matrizAdjacencia[vertice - 1][j] = -1;
                            break;
                        case 'n':
                            matrizAdjacencia[i][j] = 0;
                            break;
                    }
                }
            }
        }
    }

    private void pegarInformacao() {
        System.out.println("Informe qtde de vertices: ");
        qtdeVertice = scanner.nextInt();
        System.out.println("Informe qtde de arestas: ");
        qtdeArestas = scanner.nextInt();
    }

    public void imprimirMatriz() {
        if (matrizAdjacencia != null) {
            for (int i = 0; i < qtdeVertice; i++) {
                for (int j = 0; j < qtdeArestas; j++) {
                    System.out.print(matrizAdjacencia[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.err.println("Matriz ainda não existe, cria uma.");
        }
    }
}