package lista_adjacencia;

import disciplinas.Disciplina;
import disciplinas.PreencherMatrizCurricular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrafoListaAdjacencia {
    Scanner scanner = new Scanner(System.in);

    public ListaAdjacencia lista = new ListaAdjacencia();
    public ListaSecundariaAdjacencia listaSecundariaAdjacencia = new ListaSecundariaAdjacencia();
    public lista_ponderado.ListaAdjacencia listaPonderado = new lista_ponderado.ListaAdjacencia();

    public void preencherGrafo() {
        PreencherMatrizCurricular.criarDisciplinas();
        List<Disciplina> disciplinas = PreencherMatrizCurricular.getDisciplinas();
        for (int i = 0; i < disciplinas.size(); i++) {
            lista.inserirFinal(i+1, disciplinas.get(i));
        }
        NoAdjacencia aux = lista.getPrimeiro();
        while (aux != null) {
            ListaSecundariaAdjacencia lsa = new ListaSecundariaAdjacencia();
            List<NoAdjacencia> noAdjacencias = new ArrayList<>();
            noAdjacencias = lista.busarNoAdjacencia(aux.getDisciplina().getCodigo());
            for (int i = 0; i < noAdjacencias.size(); i++) {
                lsa.inserirFinal(noAdjacencias.get(i));
            }
            aux.setLista(lsa);
            aux = aux.getProx();
        }
    }

    public void imprimirLista() {
        lista.exibir();
    }

    public void imprimirListaBusca() {
        lista.exibirBusca();
    }

    /*public void listaNaoOrientada() {
        int op = 0;
        while (op == 0) {
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
                while (!lista.buscarVertice(valorListaMatriz)) {
                    System.out.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorListaMatriz);
                grauVertice--;
            }
            aux.setLista(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void listaNaoOrientadaPonderada() {
        int op = 0;
        while (op == 0) {
            System.out.println("Inserir vertice: ");
            int valor = scanner.nextInt();
            lista.inserirFinal(valor);
            System.out.println("Continuar - 0\nSair - 1");
            op = scanner.nextInt();
        }
        lista_ponderado.NoAdjacencia aux = listaPonderado.getPrimeiro();
        while (aux != null) {
            lista_ponderado.ListaSecundariaAdjacencia listaMatriz = new lista_ponderado.ListaSecundariaAdjacencia();
            System.out.println("Qual grau do vertice " + aux.getValor() + "?");
            int grauVertice = scanner.nextInt();
            while (grauVertice > 0) {
                System.out.println("Inserir vertice: ");
                int valorLista = scanner.nextInt();
                System.out.println("Inserir valor: ");
                int valorPoderadoLista = scanner.nextInt();
                while (!lista.buscarVertice(valorLista)) {
                    System.err.println("Inserir vertice: ");
                    valorLista = scanner.nextInt();
                    System.out.println("Inserir valor: ");
                    valorPoderadoLista = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorLista, valorPoderadoLista);
                grauVertice--;
            }
            aux.setLista(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void listaOrientada() {
        int op = 0;
        while (op == 0) {
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
                while (!lista.buscarVertice(valorListaMatriz)) {
                    System.err.println("Inserir vertice: ");
                    valorListaMatriz = scanner.nextInt();
                }

                listaMatriz.inserirFinal(valorListaMatriz);
                qtde--;
            }
            aux.setLista(listaMatriz);
            aux = aux.getProx();
        }
    }

    public void listaOrientadaPonderada() {
        int op = 0;
        while (op == 0) {
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
                int valorLista = scanner.nextInt();
                System.out.println("Inserir valor: ");
                int valorPoderadoLista = scanner.nextInt();
                while (!listaPonderado.buscarVertice(valorLista)) {
                    System.err.println("Inserir vertice: ");
                    valorLista = scanner.nextInt();
                    System.out.println("Inserir valor: ");
                    valorPoderadoLista = scanner.nextInt();
                }
                listaMatriz.inserirFinal(valorLista, valorPoderadoLista);
                qtde--;
            }
            aux.setLista(listaMatriz);
            aux = aux.getProx();
        }
    }*/

    public void info() {
        ordemGrafo();
        eOrientado();
        eGrafoSimples();
    }

    private void ordemGrafo() {
        NoAdjacencia aux = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        System.out.printf("Grafo de ordem: %d\n", cont);
    }

    private void qtdeArestasNaoOrientado() {
        int cont = 0;
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            NoListaSecundariaAdjacencia aux2 = aux1.getLista().getPrimeiro();
            while (aux2 != null) {
                cont++;
                aux2 = aux2.getProx();
            }
            aux1 = aux1.getProx();
        }
        System.out.printf("Qtde de arestas: %d\n", (cont / 2));
    }

    private void qtdeArestasOrientado() {
        int cont = 0;
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            NoListaSecundariaAdjacencia aux2 = aux1.getLista().getPrimeiro();
            while (aux2 != null) {
                cont++;
                aux2 = aux2.getProx();
            }
            aux1 = aux1.getProx();
        }
        System.out.printf("Qtde de arestas: %d\n", cont);
    }

    private void eOrientado() {
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        } else {
            int valor = lista.getPrimeiro().getLista().getPrimeiro().getNoAdjacencia().getValor();
            if (!lista.buscarVerticeNumero(valor, lista.getPrimeiro().getValor())) {
                System.out.println("Grafo Orientado");
                qtdeArestasOrientado();
                arcosOrientado();
                qtdeFontesSumidouros();
                grauDosVertices();
            } else {
                System.out.println("Grafo Não Orientado");
                qtdeArestasNaoOrientado();
                arcosNaoOrientado();
                grauDosVertices();
                eEuleriano();
            }
        }
    }

    private void grauDosVertices() {
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            int cont = 0;
            ///////////////////
            NoListaSecundariaAdjacencia aux = aux1.getLista().getPrimeiro();
            if (aux == null) {
                System.out.printf("V: %d\tG: %d\n", aux1.getValor(), 0);
            }
            while (aux != null) {
                cont++;
                aux = aux.getProx();
            }
            System.out.printf("V: %d\tG: %d\n", aux1.getValor(), cont);
            /////////////////
            aux1 = aux1.getProx();
        }
    }

    private void arcosOrientado() {
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (aux1 == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            NoListaSecundariaAdjacencia aux2 = aux1.getLista().getPrimeiro();
            if (aux2 == null) {
                System.err.println("null");
            }
            while (aux2 != null) {
                System.out.printf("(%d -> %d)\n", aux1.getValor(), aux2.getNoAdjacencia().getValor());
                aux2 = aux2.getProx();
            }
            aux1 = aux1.getProx();
        }
    }

    private void arcosNaoOrientado() {
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (aux1 == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            NoListaSecundariaAdjacencia aux2 = aux1.getLista().getPrimeiro();
            if (aux2 == null) {
                System.err.println("null");
            }
            while (aux2 != null) {
                System.out.printf("(%d, %d)\n", aux1.getValor(), aux2.getNoAdjacencia().getValor());
                aux2 = aux2.getProx();
            }
            aux1 = aux1.getProx();
        }
    }

    private void qtdeFontesSumidouros() {
        int contFontes = 0;
        int contSumidouros = 0;

        NoAdjacencia aux1 = lista.getPrimeiro();
        if (aux1 == null) {
            System.err.println("Fila vazia");
        }
        int cont = 0;
        while (aux1 != null) {
            cont = 0;
            NoListaSecundariaAdjacencia aux2 = aux1.getLista().getPrimeiro();
            if (aux2 == null) {
                return;
            }
            while (aux2 != null) {
                if (listaSecundariaAdjacencia.buscarVertice(aux1.getValor())) {
                    cont++;
                }
                aux2 = aux2.getProx();
            }
            aux1 = aux1.getProx();
        }

        if (cont == 0) {
            contFontes++;
        } else {
            contSumidouros++;
        }
        System.out.printf("%d - fontes\n", contFontes);
        System.out.printf("%d - sumidouro\n", contSumidouros);
    }

    private void eEuleriano() {
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            int cont = 0;
            ///////////////////
            NoListaSecundariaAdjacencia aux = listaSecundariaAdjacencia.getPrimeiro();
            if (listaSecundariaAdjacencia.getPrimeiro() == null) {
                System.out.println("Não é Euleriano");
                return;
            }
            while (aux != null) {
                cont++;
                aux = aux.getProx();
            }
            if (cont % 2 != 0) {
                System.out.println("Não é Euleriano");
                return;
            }
            /////////////////
            aux1 = aux1.getProx();
        }
        System.out.println("Euleriano");
    }

    private void eGrafoSimples() {
        int contLacos = 0;
        NoAdjacencia aux1 = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        while (aux1 != null) {
            ///////////////////
            NoListaSecundariaAdjacencia aux = aux1.getLista().getPrimeiro();
            if (aux == null) {
                return;
            }
            while (aux != null) {
                if (aux.getNoAdjacencia().getValor() == aux1.getValor()) {
                    contLacos++;
                }
                aux = aux.getProx();
            }
            /////////////////
            aux1 = aux1.getProx();
        }

        if (contLacos > 0) {
            System.out.printf("Grafo Não Simples, possui %d laços\n", contLacos);
        } else {
            System.out.println("Grafo Simples");
        }
    }

    public int size() {
        NoAdjacencia aux = lista.getPrimeiro();
        if (lista.getPrimeiro() == null) {
            System.err.println("Fila vazia");
        }
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        return cont;
    }
}