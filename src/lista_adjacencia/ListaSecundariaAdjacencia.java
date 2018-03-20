package lista_adjacencia;

public class ListaSecundariaAdjacencia {

    private NoListaSecundariaAdjacencia primeiro;
    private NoListaSecundariaAdjacencia ultimo;

    public ListaSecundariaAdjacencia() {
        this.primeiro = null;
    }

    void inserirFinal(int valor) {
        NoListaSecundariaAdjacencia novo = new NoListaSecundariaAdjacencia(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    void exibir() {
        NoListaSecundariaAdjacencia aux = primeiro;
        if(primeiro == null){
            System.err.println("null");
        }
        while (aux != null) {
            System.err.print(aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.println();

    }

    public boolean buscarVertice(int vertice) {
        NoListaSecundariaAdjacencia aux = primeiro;
        while (aux != null) {
            if(aux.getValor() == vertice){
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public NoListaSecundariaAdjacencia getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoListaSecundariaAdjacencia primeiro) {
        this.primeiro = primeiro;
    }

    public NoListaSecundariaAdjacencia getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoListaSecundariaAdjacencia ultimo) {
        this.ultimo = ultimo;
    }

}