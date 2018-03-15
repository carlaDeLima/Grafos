package lista_indexada;

public class ListaSecundariaIndexada {

    private NoSecundarioIndexada primeiro;
    private NoSecundarioIndexada ultimo;

    public ListaSecundariaIndexada() {
        this.primeiro = null;
    }

    public void inserirFinal(int valor) {
        NoSecundarioIndexada novo = new NoSecundarioIndexada(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        NoSecundarioIndexada aux = primeiro;
        if(primeiro == null){
            System.err.println("Lista vazia");
        }
        while (aux != null) {
            System.out.println(aux.getValor() + " ");
            aux = aux.getProx();
        }

    }

    public boolean buscarVertice(int vertice) {
        NoSecundarioIndexada aux = primeiro;
        while (aux != null) {
            if(aux.getValor() == vertice){
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public NoSecundarioIndexada getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoSecundarioIndexada primeiro) {
        this.primeiro = primeiro;
    }

    public NoSecundarioIndexada getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoSecundarioIndexada ultimo) {
        this.ultimo = ultimo;
    }
}
