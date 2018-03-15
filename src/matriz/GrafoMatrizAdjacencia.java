package matriz;
import java.util.Scanner;

public class GrafoMatrizAdjacencia {
    Scanner scanner = new Scanner(System.in);

    private int qtdeVertice;
    private int[][] matrizAdjacencia;

    public void matrizNaoOrientada() {
        System.out.println("Informe qtde de vertices: ");
        qtdeVertice = scanner.nextInt();
        matrizAdjacencia = new int[qtdeVertice][qtdeVertice];
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (i < j) {
                    System.out.println("Vertice " + (i + 1) + " se liga com o vertice " + (j + 1));
                    System.out.println("s - sim | n - não");
                    char op = scanner.next().charAt(0);
                    switch (op) {
                        case 's':
                            matrizAdjacencia[i][j] = 1;
                            matrizAdjacencia[j][i] = 1;
                            break;
                        case 'n':
                            matrizAdjacencia[i][j] = 0;
                            matrizAdjacencia[j][i] = 0;
                            break;
                    }
                } else if (i == j) {
                    matrizAdjacencia[i][j] = 0;
                }

            }
        }
    }

    public void matrizOrientada() {
        System.out.println("Informe qtde de vertices: ");
        qtdeVertice = scanner.nextInt();
        matrizAdjacencia = new int[qtdeVertice][qtdeVertice];
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                System.out.println("Vertice " + (i + 1) + " se liga com o vertice " + (j + 1));
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

    public void matrizOrientadaPoderada() {
        System.out.println("Informe qtde de vertices: ");
        qtdeVertice = scanner.nextInt();
        matrizAdjacencia = new int[qtdeVertice][qtdeVertice];
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                System.out.println("Vertice " + (i + 1) + " se liga com o vertice " + (j + 1));
                System.out.println("s - sim | n - não");
                char op = scanner.next().charAt(0);
                switch (op) {
                    case 's':
                        System.out.println("Informe valor: ");
                        matrizAdjacencia[i][j] = scanner.nextInt();
                        break;
                    case 'n':
                        matrizAdjacencia[i][j] = 0;
                        break;
                }
            }
        }
    }

    public void imprimirMatriz() {
        if(matrizAdjacencia != null){
            for (int i = 0; i < matrizAdjacencia.length; i++) {
                for (int j = 0; j < matrizAdjacencia.length; j++) {
                    System.out.print(matrizAdjacencia[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.err.println("Matriz ainda não existe, cria uma.");
        }

    }

}