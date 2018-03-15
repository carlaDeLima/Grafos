package lista;
import java.util.Scanner;

public class GrafoListaAdjacencia {
    Scanner scanner = new Scanner(System.in);

    ListaAdjacencia lista = new ListaAdjacencia();

    lista_ponderado.ListaAdjacencia listaPonderado = new lista_ponderado.ListaAdjacencia();

    public void listaNaoOrientada(){
        int op = 0;
        while(op == 0){
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            lista.inserirFinal(valor);
            System.out.println("Continuar - 0\nSair - 1");
            op = scanner.nextInt();
        }
        NoAdjacencia aux = lista.getPrimeiro();
        while (aux != null) {
            ListaSecundariaAdjacencia listaMatriz = new ListaSecundariaAdjacencia();
            System.out.println("Qual grau do vertice " + aux.getValor() + "?");
            int grauVertice = scanner.nextInt();
            while (grauVertice > 0) {
                System.out.println("Inserir vertice: ");
                int valorListaMatriz = scanner.nextInt();
                while(!lista.buscarVertice(valorListaMatriz)){
                    System.out.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorListaMatriz);
                grauVertice--;
            }
            aux.setListaMatriz(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void listaOrientada(){
        int op = 0;
        while(op == 0){
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            lista.inserirFinal(valor);
            System.out.println("Continuar - 0\nSair - 1");
            op = scanner.nextInt();
        }
        NoAdjacencia aux = lista.getPrimeiro();
        while (aux != null) {
            ListaSecundariaAdjacencia listaMatriz = new ListaSecundariaAdjacencia();
            System.out.println("Esse vertice " + aux.getValor() + " aponta para quantos outros?");
            int qtde = scanner.nextInt();
            while (qtde > 0) {
                System.out.println("Inserir vertice: ");
                int valorListaMatriz = scanner.nextInt();
                while(!lista.buscarVertice(valorListaMatriz)){
                    System.out.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorListaMatriz);
                qtde--;
            }
            aux.setListaMatriz(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void listaOrientadaPoderada(){
        int op = 0;
        while(op == 0){
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            listaPonderado.inserirFinal(valor);
            System.out.println("Continuar - 0\nSair - 1");
            op = scanner.nextInt();
        }
        lista_ponderado.NoAdjacencia aux = listaPonderado.getPrimeiro();
        while (aux != null) {
            lista_ponderado.ListaSecundariaAdjacencia listaMatriz = new lista_ponderado.ListaSecundariaAdjacencia();
            System.out.println("Esse vertice " + aux.getValor() + " aponta para quantos outros?");
            int qtde = scanner.nextInt();
            while (qtde > 0) {
                System.out.println("Inserir vertice: ");
                int valorListaMatriz = scanner.nextInt();
                int valorPoderadoListaMatriz = scanner.nextInt();
                while(!listaPonderado.buscarVertice(valorListaMatriz)){
                    System.out.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                    System.out.println("Inserir vertice: ");
                    valorPoderadoListaMatriz = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorListaMatriz, valorPoderadoListaMatriz);
                qtde--;
            }
            aux.setListaMatriz(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void imprimirLista(){
        lista.exibir();
    }
}