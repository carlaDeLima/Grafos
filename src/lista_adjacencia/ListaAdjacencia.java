package lista_adjacencia;

public class ListaAdjacencia {

    private NoAdjacencia primeiro;
    private NoAdjacencia ultimo;

    public ListaAdjacencia() {
        this.primeiro = null;
    }

    void inserirFinal(int valor) {
        NoAdjacencia novo = new NoAdjacencia(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        NoAdjacencia aux = primeiro;
        if(primeiro == null){
            System.err.println("Lista vazia");
        }
        while (aux != null) {
            System.out.println(aux.getValor() + " ");
            aux.getLista().exibir();
            aux = aux.getProx();
        }
    }

    public boolean buscarVertice(int vertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if(aux.getValor() == vertice){
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public boolean buscarVerticeNumero(int vertice, int primeiroVertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if(aux.getValor() == vertice){
                if(aux.getLista().buscarVertice(primeiroVertice)) {
                    return true;
                }
            }
            aux = aux.getProx();
        }
        return false;
    }

    public NoAdjacencia getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoAdjacencia primeiro) {
        this.primeiro = primeiro;
    }

    public NoAdjacencia getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoAdjacencia ultimo) {
        this.ultimo = ultimo;
    }

}