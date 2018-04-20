package lista_adjacencia;

public class NoListaSecundariaAdjacencia {

    private int valor;
    private int posicao;
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

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}