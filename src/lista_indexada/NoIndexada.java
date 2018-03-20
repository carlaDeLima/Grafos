package lista_indexada;

public class NoIndexada {

    private int valorGrafo;
    private Integer posInicio;
    private ListaSecundariaIndexada listaSecundariaIndexada;
    private Integer fim;
    private NoIndexada prox;

    public NoIndexada(int valorGrafo) {
        this.valorGrafo = valorGrafo;
        this.posInicio = null;
        this.listaSecundariaIndexada = null;
        this.fim = null;
        this.prox = null;
    }

    public int getValorGrafo() {
        return valorGrafo;
    }

    public void setValorGrafo(int valorGrafo) {
        this.valorGrafo = valorGrafo;
    }

    public Integer getPosInicio() {
        return posInicio;
    }

    public void setPosInicio(Integer posInicio) {
        this.posInicio = posInicio;
    }

    public ListaSecundariaIndexada getListaSecundariaIndexada() {
        return listaSecundariaIndexada;
    }

    public void setListaSecundariaIndexada(ListaSecundariaIndexada listaSecundariaIndexada) {
        this.listaSecundariaIndexada = listaSecundariaIndexada;
    }

    public Integer getFim() {
        return fim;
    }

    public void setFim(Integer fim) {
        this.fim = fim;
    }

    public NoIndexada getProx() {
        return prox;
    }

    public void setProx(NoIndexada prox) {
        this.prox = prox;
    }
}
