import lista.GrafoListaAdjacencia;
import lista_indexada.GrafoListaIndexada;
import matriz.GrafoMatrizAdjacencia;
import matriz.GrafoMatrizIncidencia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Matriz de Adjacências - 1");

        System.out.println("Lista de Adjacências - 2");

        System.out.println("Matriz de Incidência - 3");

        System.out.println("Lista de Indexada - 4");

        System.out.println("Informe opção:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                GrafoMatrizAdjacencia grafoMatrizAdjacencia = new GrafoMatrizAdjacencia();
                System.out.println("MATRIZ DE ADJACÊNCIAS");
                System.out.println("Matriz não orientada - 1");
                System.out.println("Matriz orientada - 2");
                System.out.println("Matriz orientada poderada - 3");
                System.out.println("Imprimir matriz - 4");
                int opGrafoMatriz = scanner.nextInt();
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
                }
                break;
            case 2:
                GrafoListaAdjacencia grafoListaAdjacencia = new GrafoListaAdjacencia();
                System.out.println("LISTA DE ADJACÊNCIAS");
                System.out.println("Lista não orientada - 1");
                System.out.println("Lista orientada - 2");
                System.out.println("Lista orientada poderada - 3");
                System.out.println("Imprimir lista - 4");
                int opListaAdjacencia = scanner.nextInt();
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
                    default:
                        break;
                }
                break;
            case 3:
                GrafoMatrizIncidencia grafoMatrizIncidencia = new GrafoMatrizIncidencia();
                System.out.println("MATRIZ DE INCIDÊNCIA");
                System.out.println("Matriz não orientada - 1");
                System.out.println("Matriz orientada - 2");
                System.out.println("Imprimir matriz - 3");
                int opGrafoMatrizIncidencia = scanner.nextInt();
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
                }
                break;
            case 4:
                GrafoListaIndexada grafoListaIndexada = new GrafoListaIndexada();
                System.out.println("LISTA INDEXADA");
                System.out.println("Lista orientada poderada - 1");
                System.out.println("Imprimir lista - 2");
                int opListaIndexada = scanner.nextInt();
                switch (opListaIndexada) {
                    case 1:
                        grafoListaIndexada.listaOrientadaPoderada();
                        break;
                    case 2:
                        //grafoListaIndexada.imprimirLista();
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }

}