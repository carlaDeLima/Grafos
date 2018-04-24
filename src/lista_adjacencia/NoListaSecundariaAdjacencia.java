package lista_adjacencia;

public class NoListaSecundariaAdjacencia {

    private NoAdjacencia valor;
    private int posicao;
    private NoListaSecundariaAdjacencia prox;

    public NoListaSecundariaAdjacencia(NoAdjacencia valor) {
        this.valor = valor;
        this.prox = null;
    }

    public NoAdjacencia getValor() {
        return valor;
    }

    public void setValor(NoAdjacencia valor) {
        this.valor = valor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public NoListaSecundariaAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoListaSecundariaAdjacencia prox) {
        this.prox = prox;
    }
}