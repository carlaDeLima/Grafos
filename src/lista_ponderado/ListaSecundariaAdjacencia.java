package lista_ponderado;

public class ListaSecundariaAdjacencia {

    private NoListaSecudanriaAdjacencia primeiro;
    private NoListaSecudanriaAdjacencia ultimo;

    public ListaSecundariaAdjacencia() {
        this.primeiro = null;
    }

    public void inserirFinal(int valor, int valorPoderadoListaMatriz) {
        NoListaSecudanriaAdjacencia novo = new NoListaSecudanriaAdjacencia(valor, valorPoderadoListaMatriz);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    void exibir() {
        NoListaSecudanriaAdjacencia aux = primeiro;
        if (primeiro == null) {
            System.err.println("null");
        }
        while (aux != null) {
            System.err.print(aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.println();

    }

    public NoListaSecudanriaAdjacencia getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoListaSecudanriaAdjacencia primeiro) {
        this.primeiro = primeiro;
    }

    public NoListaSecudanriaAdjacencia getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoListaSecudanriaAdjacencia ultimo) {
        this.ultimo = ultimo;
    }

}