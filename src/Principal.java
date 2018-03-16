import lista.GrafoListaAdjacencia;
import lista_indexada.GrafoListaIndexada;
import matriz.GrafoMatrizAdjacencia;
import matriz.GrafoMatrizIncidencia;

import java.util.Scanner;

public class Principal {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        int continuar = 0;

        opcao = getMenu();

        while (continuar == 0) {
            switch (opcao) {
                case 1:
                    GrafoMatrizAdjacencia grafoMatrizAdjacencia = new GrafoMatrizAdjacencia();
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
                            //grafoMatrizAdjacencia.info();
                            break;
                        default:
                            System.err.println("Essa opção não existe");
                            break;
                    }
                    break;
                case 2:
                    GrafoListaAdjacencia grafoListaAdjacencia = new GrafoListaAdjacencia();
                    int opListaAdjacencia = menuListaAdjacencia();
                    switch (opListaAdjacencia) {
                        case 1:
                            grafoListaAdjacencia.listaNaoOrientada();
                            break;
                        case 2:
                            grafoListaAdjacencia.listaOrientada();
                            break;
                        case 3:
                            grafoListaAdjacencia.listaOrientadaPoderada();
                            break;
                        case 4:
                            grafoListaAdjacencia.imprimirLista();
                            break;
                        case 5:
                            //grafoListaAdjacencia.info();
                            break;
                        default:
                            System.err.println("Essa opção não existe");
                            break;
                    }
                    break;
                case 3:
                    GrafoMatrizIncidencia grafoMatrizIncidencia = new GrafoMatrizIncidencia();
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
                            //grafoMatrizIncidencia.info();
                            break;
                        default:
                            System.err.println("Essa opção não existe");
                            break;
                    }
                    break;
                case 4:
                    GrafoListaIndexada grafoListaIndexada = new GrafoListaIndexada();
                    int opListaIndexada = menuListaIncidencia();
                    switch (opListaIndexada) {
                        case 1:
                            grafoListaIndexada.listaOrientadaPoderada();
                            grafoListaIndexada.imprimirLista();
                            break;
                        case 2:
                            grafoListaIndexada.imprimirLista();
                            break;
                        case 3:
                            //grafoListaIndexada.info();
                            break;
                        default:
                            System.err.println("Essa opção não existe");
                            break;
                    }
                    break;
                default:
                    System.err.println("Essa opção não existe");
                    getMenu();
                    break;
            }
            getMenu();
        }
    }

    private static int getMenu() {
        int opcao;
        System.out.println("Matriz de Adjacências - 1");

        System.out.println("Lista de Adjacências - 2");

        System.out.println("Matriz de Incidência - 3");

        System.out.println("Lista de Indexada - 4");

        System.out.println("Informe opção:");
        opcao = scanner.nextInt();
        return opcao;
    }

    private static int menuMatrizAdjacencia() {
        int opGrafoMatriz;
        System.out.println("MATRIZ DE ADJACÊNCIAS");
        System.out.println("Matriz não orientada - 1");
        System.out.println("Matriz orientada - 2");
        System.out.println("Matriz orientada poderada - 3");
        System.out.println("Imprimir matriz - 4");
        System.out.println("Informações que o grafo pode dar - 5");
        opGrafoMatriz = scanner.nextInt();
        return opGrafoMatriz;
    }

    private static int menuListaAdjacencia() {
        int opListaAdjacencia;
        System.out.println("LISTA DE ADJACÊNCIAS");
        System.out.println("Lista não orientada - 1");
        System.out.println("Lista orientada - 2");
        System.out.println("Lista orientada poderada - 3");
        System.out.println("Imprimir lista - 4");
        System.out.println("Informações que o grafo pode dar - 5");
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
        opGrafoMatrizIncidencia = scanner.nextInt();
        return opGrafoMatrizIncidencia;
    }

    private static int menuListaIncidencia() {
        int opListaIndexada;
        System.out.println("LISTA INDEXADA");
        System.out.println("Lista orientada poderada - 1");
        System.out.println("Imprimir lista - 2");
        System.out.println("Informações que o grafo pode dar - 3");
        opListaIndexada = scanner.nextInt();
        return opListaIndexada;
    }
}