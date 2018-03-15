package lista_ponderado;

public class NoListaSecudanriaAdjacencia {

    private int valor;
    private int valorPoderadoListaMatriz;
    private NoListaSecudanriaAdjacencia prox;

    public NoListaSecudanriaAdjacencia(int valor, int valorPoderadoListaMatriz) {
        this.valor = valor;
        this.valorPoderadoListaMatriz = valorPoderadoListaMatriz;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorPoderadoListaMatriz() {
        return valorPoderadoListaMatriz;
    }

    public void setValorPoderadoListaMatriz(int valorPoderadoListaMatriz) {
        this.valorPoderadoListaMatriz = valorPoderadoListaMatriz;
    }

    public NoListaSecudanriaAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoListaSecudanriaAdjacencia prox) {
        this.prox = prox;
    }

}