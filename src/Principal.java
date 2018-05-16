import busca_largura.BuscaLargura;
import busca_profundidade.BuscaProfundidade;
import lista_adjacencia.GrafoListaAdjacencia;
import lista_indexada.GrafoListaIndexada;
import matriz.GrafoMatrizAdjacencia;
import matriz.GrafoMatrizIncidencia;

import java.util.Scanner;

public class Principal {

    static Scanner scanner = new Scanner(System.in);
    private static int opcao;

    public static void main(String[] args) {
        int continuar = 0;

        while (continuar == 0) {
            getMenu();
            switch (opcao) {
                case 1:
                    getGrafoMatrizAdjacencia();
                    break;
                case 2:
                    getGrafoListaAdjacencia();
                    break;
                case 3:
                    getGrafoMatrizIncidencia();
                    break;
                case 4:
                    getGrafoListaIndexada();
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    break;
            }
            System.out.println("Deseja continuar?\nContinuar - 0\nSair - 1");
            continuar = scanner.nextInt();
        }
    }

    private static void getGrafoMatrizAdjacencia() {
        int continuarOp1 = 1;
        GrafoMatrizAdjacencia grafoMatrizAdjacencia = new GrafoMatrizAdjacencia();
        while (continuarOp1 == 1) {
            int opGrafoMatriz = menuMatrizAdjacencia();
            switch (opGrafoMatriz) {
                case 1:
                    grafoMatrizAdjacencia.matrizNaoOrientada();
                    break;
                case 2:
                    grafoMatrizAdjacencia.matrizOrientada();
                    break;
                case 3:
                    grafoMatrizAdjacencia.matrizOrientadaPoderada();
                    break;
                case 4:
                    grafoMatrizAdjacencia.imprimirMatriz();
                    break;
                case 5:
                    grafoMatrizAdjacencia.info();
                    break;
                case 0:
                    continuarOp1 = 0;
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    break;
            }
        }
    }

    private static void getGrafoListaAdjacencia() {
        int continuarOp2 = 1;
        GrafoListaAdjacencia grafoListaAdjacencia = new GrafoListaAdjacencia();
        while (continuarOp2 == 1) {
            int opListaAdjacencia = menuListaAdjacencia();
            switch (opListaAdjacencia) {
                case 1:
                    grafoListaAdjacencia.listaNaoOrientada();
                    break;
                case 2:
                    grafoListaAdjacencia.listaOrientada();
                    break;
                case 3:
                    grafoListaAdjacencia.listaOrientadaPonderada();
                    break;
                case 4:
                    grafoListaAdjacencia.imprimirLista();
                    break;
                case 5:
                    grafoListaAdjacencia.info();
                    break;
                case 6://busca em largura
                    BuscaLargura buscaLargura = new BuscaLargura();
                    System.out.println("Informe vertice inicial: ");
                    int verticeBL = scanner.nextInt();
                    buscaLargura.buscar(grafoListaAdjacencia, verticeBL);
                    break;
                case 7://busca em profundidade
                    BuscaProfundidade buscaProfundidade = new BuscaProfundidade();
                    System.out.println("Informe vertice inicial: ");
                    int verticeBP = scanner.nextInt();
                    buscaProfundidade.buscar(grafoListaAdjacencia, verticeBP);
                    break;
                case 0:
                    continuarOp2 = 0;
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    break;
            }
        }
    }

    private static void getGrafoMatrizIncidencia() {
        int continuarOp3 = 1;
        GrafoMatrizIncidencia grafoMatrizIncidencia = new GrafoMatrizIncidencia();
        while (continuarOp3 == 1) {
            int opGrafoMatrizIncidencia = menuMatrizIncidencia();
            switch (opGrafoMatrizIncidencia) {
                case 1:
                    grafoMatrizIncidencia.matrizNaoOrientada();
                    break;
                case 2:
                    grafoMatrizIncidencia.matrizOrientada();
                    break;
                case 3:
                    grafoMatrizIncidencia.imprimirMatriz();
                    break;
                case 4:
                    grafoMatrizIncidencia.info();
                    break;
                case 0:
                    continuarOp3 = 0;
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    break;
            }
        }
    }

    private static void getGrafoListaIndexada() {
        int continuarOp4 = 1;
        GrafoListaIndexada grafoListaIndexada = new GrafoListaIndexada();
        while (continuarOp4 == 1) {
            int opListaIndexada = menuListaIndexada();
            switch (opListaIndexada) {
                case 1://nao orientda
                    grafoListaIndexada.listaNaoOrientada();
                    grafoListaIndexada.imprimirLista();
                    break;
                case 2://orientada
                    break;
                case 3://orientda ponderada
                    break;
                case 4://imprimir lista
                    grafoListaIndexada.imprimirLista();
                    break;
                case 5://info lista
                    //grafoListaIndexada.info();
                    break;
                case 0:
                    continuarOp4 = 0;
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    break;
            }
        }
    }

    private static void getMenu() {
        System.out.println("Matriz de Adjacências - 1");
        System.out.println("Lista de Adjacências - 2");
        System.out.println("Matriz de Incidência - 3");
        System.out.println("Lista de Indexada - 4");
        System.out.println("Informe opção:");
        opcao = scanner.nextInt();
    }

    private static int menuMatrizAdjacencia() {
        int opGrafoMatriz;
        System.out.println("MATRIZ DE ADJACÊNCIAS");
        System.out.println("Matriz não orientada - 1");
        System.out.println("Matriz orientada - 2");
        System.out.println("Matriz orientada poderada - 3");
        System.out.println("Imprimir matriz - 4");
        System.out.println("Informações que o grafo pode dar - 5");
        System.out.println("voltar menu principal - 0");
        opGrafoMatriz = scanner.nextInt();
        return opGrafoMatriz;
    }

    private static int menuListaAdjacencia() {
        int opListaAdjacencia;
        System.out.println("LISTA DE ADJACÊNCIAS");
        System.out.println("Lista não orientada - 1");
        System.out.println("Lista orientada - 2");
        System.out.println("Lista orientada poderada - 3");
        System.out.println("Imprimir lista_adjacencia - 4");
        System.out.println("Informações que o grafo pode dar - 5");
        System.out.println("Busca em largura - 6");
        System.out.println("Busca em profundidade - 7");
        System.out.println("voltar menu principal - 0");
        opListaAdjacencia = scanner.nextInt();
        return opListaAdjacencia;
    }

    private static int menuMatrizIncidencia() {
        int opGrafoMatrizIncidencia;
        System.out.println("MATRIZ DE INCIDÊNCIA");
        System.out.println("Matriz não orientada - 1");
        System.out.println("Matriz orientada - 2");
        System.out.println("Imprimir matriz - 3");
        System.out.println("Informações que o grafo pode dar - 4");
        System.out.println("voltar menu principal - 0");
        opGrafoMatrizIncidencia = scanner.nextInt();
        return opGrafoMatrizIncidencia;
    }

    private static int menuListaIndexada() {
        int opListaIndexada;
        System.out.println("LISTA INDEXADA");
        System.out.println("Lista não orientada - 1");
        System.out.println("Lista orientada - 2");
        System.out.println("Lista orientada ponderada - 3");
        System.out.println("Imprimir Lista_Indexada - 4");
        System.out.println("Informações que o grafo pode dar - 5");
        System.out.println("voltar menu principal - 0");
        opListaIndexada = scanner.nextInt();
        return opListaIndexada;
    }
}