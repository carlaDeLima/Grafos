package lista_indexada;

public class NoSecundarioIndexada {

    private int valor;
    private NoSecundarioIndexada prox;

    public NoSecundarioIndexada(int valor) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoSecundarioIndexada getProx() {
        return prox;
    }

    public void setProx(NoSecundarioIndexada prox) {
        this.prox = prox;
    }
}
