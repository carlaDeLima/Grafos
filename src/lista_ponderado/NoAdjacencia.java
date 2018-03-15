package lista_ponderado;

public class NoAdjacencia {

    private int valor;
    private ListaSecundariaAdjacencia listaMatriz;
    private NoAdjacencia prox;

    public NoAdjacencia(int valor) {
        this.valor = valor;
        this.listaMatriz = null;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ListaSecundariaAdjacencia getListaMatriz() {
        return listaMatriz;
    }

    public void setListaMatriz(ListaSecundariaAdjacencia listaMatriz) {
        this.listaMatriz = listaMatriz;
    }

    public NoAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoAdjacencia prox) {
        this.prox = prox;
    }

}