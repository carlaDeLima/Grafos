package lista_indexada;

public class ListaIndexada {

    private NoIndexada primeiro;
    private NoIndexada ultimo;

    public ListaIndexada() {
        this.primeiro = null;
    }

    public void inserirFinal(int valorGrafo, int posInicio) {
        NoIndexada novo = new NoIndexada(valorGrafo, posInicio);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        NoIndexada aux = primeiro;
        if(primeiro == null){
            System.err.println("Lista vazia");
        }
        while (aux != null) {
            System.out.println(aux.getValorGrafo() + " ");
            aux = aux.getProx();
        }

    }

    public boolean buscarVertice(int vertice) {
        NoIndexada aux = primeiro;
        while (aux != null) {
            if(aux.getValorGrafo() == vertice){
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public NoIndexada getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoIndexada primeiro) {
        this.primeiro = primeiro;
    }

    public NoIndexada getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoIndexada ultimo) {
        this.ultimo = ultimo;
    }

}
