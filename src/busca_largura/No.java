package busca_largura;

public class No {
    private Cor color;
    private int distancia;
    private int pai;
    private No prox;

    public No(Cor color, int distancia, int pai) {
        this.color = color;
        this.distancia = distancia;
        this.pai = pai;
        this.prox = null;
    }

    public Cor getColor() {
        return color;
    }

    public void setColor(Cor color) {
        this.color = color;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPai() {
        return pai;
    }

    public void setPai(int pai) {
        this.pai = pai;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
