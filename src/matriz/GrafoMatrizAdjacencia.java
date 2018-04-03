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
                if (i <= j) {
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
        if (matrizAdjacencia != null) {
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

    public void info() {
        System.out.printf("Grafo de ordem: %d\n", getQtdeVertice());
        qtdeArestas();
        eOrientado();
        eGrafoSimples();
    }

    private void qtdeArestas() {
        int cont = 0;
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    cont++;
                }
            }
        }
        System.out.printf("Qtde de arestas: %d\n", cont / 2);
    }

    private void eOrientado() {
        int cont = 0;
        int eOrientado = (qtdeVertice * qtdeVertice);

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == matrizAdjacencia[j][i]) {
                    cont++;
                }
            }
        }

        if (cont == eOrientado) {
            System.out.println("Grafo Não Orientado");
            System.out.println("Não ponderado");
            grauDosVertices();
            arcosNaoOrientado();
            eEuleriano();
        } else {
            System.out.println("Grafo Orientado ou Dígrafo");
            arcosOrientado();
            qtdeFonteSumidouro();
        }
    }

    private void eEuleriano() {
        int contQtdeVertice = 0;

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            int cont = 0;
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    cont++;
                }
            }
            if (cont % 2 == 0) {
                contQtdeVertice++;
            }
        }

        if (contQtdeVertice == qtdeVertice) {
            System.out.println("Euleriano");
        } else {
            System.out.println("Não é Euleriano");
        }
    }

    private void grauDosVertices() {
        System.out.println("Grau dos Vertices");

        int[] grauVertice = new int[qtdeVertice];

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            int cont = 0;
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    cont++;
                }
            }
            System.out.printf("V: %d\tG: %d\n", i + 1, cont);
            grauVertice[i] = cont;
        }

        //Regular: todos os vertices tem mesmo grau
        for (int i = 1; i < grauVertice.length; i++) {
            if (grauVertice[i] != grauVertice[i - 1]) {
                System.out.println("Não é Regular");
                return;
            }
            if (i == grauVertice.length - 1) {
                System.out.println("É Regular");
            }
        }
    }

    private void arcosNaoOrientado() {
        System.out.println("Arcos(Pares)");
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (i <= j && matrizAdjacencia[i][j] == 1) {
                    System.out.printf("(%d, %d)\n", i + 1, j + 1);
                }
            }
        }
    }

    private void arcosOrientado() {
        System.out.println("Arcos(Pares)");
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    System.out.printf("(%d -> %d)\n", i + 1, j + 1);
                }

            }
        }
    }

    private void eGrafoSimples() {
        int contLacos = 0;

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (i == j && matrizAdjacencia[i][j] == 1) {
                    contLacos++;
                }
            }
        }

        if (contLacos == 0) {
            System.out.println("Grafo Simples");
        } else {
            System.out.printf("Grafo Não Simples, possui %d laços", contLacos);
        }
    }

    private void qtdeFonteSumidouro() {
        int contFonte = 0;
        int contSumidouro = 0;

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    contFonte++;
                }
                if (matrizAdjacencia[(matrizAdjacencia.length - 1) - j][j] == 1) {
                    contSumidouro++;
                }
            }
            if (contFonte == 0 && contSumidouro > 0) {
                System.out.printf("%d - sumidouro\t", i + 1);
            }
            if (contFonte > 0 && contSumidouro == 0) {
                System.out.printf("%d - fonte\t", i + 1);
            }
        }
        System.out.println();
    }

    public int getQtdeVertice() {
        return qtdeVertice;
    }

    public void setQtdeVertice(int qtdeVertice) {
        this.qtdeVertice = qtdeVertice;
    }

    public int[][] getMatrizAdjacencia() {
        return matrizAdjacencia;
    }

    public void setMatrizAdjacencia(int[][] matrizAdjacencia) {
        this.matrizAdjacencia = matrizAdjacencia;
    }
}