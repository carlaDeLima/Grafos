package lista_ponderado;

public class NoAdjacencia {

    private int valor;
    private ListaSecundariaAdjacencia lista;
    private NoAdjacencia prox;

    public NoAdjacencia(int valor) {
        this.valor = valor;
        this.lista = null;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ListaSecundariaAdjacencia getLista() {
        return lista;
    }

    public void setLista(ListaSecundariaAdjacencia lista) {
        this.lista = lista;
    }

    public NoAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoAdjacencia prox) {
        this.prox = prox;
    }

}