package lista;
public class NoListaSecundariaAdjacencia {

    private int valor;
    private NoListaSecundariaAdjacencia prox;

    public NoListaSecundariaAdjacencia(int valor) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoListaSecundariaAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoListaSecundariaAdjacencia prox) {
        this.prox = prox;
    }

}