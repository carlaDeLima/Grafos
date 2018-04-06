package busca_largura;

public class Fila {

    private NoFila primeiro;
    private NoFila ultimo;

    public Fila() {
        this.primeiro = null;
    }

    public void removerInicio() {
        NoFila aux = primeiro;
        if (primeiro == null) {
            System.err.println("Fila vazia");
        } else {
            primeiro = primeiro.getProx();
        }
    }

    public void inserirFinal(int valor) {
        NoFila novo = new NoFila(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        NoFila aux = primeiro;
        if (primeiro == null) {
            System.err.println("Fila vazia");
        }
        while (aux != null) {
            System.out.println(aux.getValor() + " ");
            aux = aux.getProx();
        }
    }

    public NoFila getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoFila primeiro) {
        this.primeiro = primeiro;
    }

    public NoFila getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoFila ultimo) {
        this.ultimo = ultimo;
    }
}

