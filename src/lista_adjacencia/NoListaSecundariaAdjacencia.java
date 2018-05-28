package lista_adjacencia;

public class NoListaSecundariaAdjacencia {

    //private Disciplina disciplina;
    private NoAdjacencia disciplina;
    private NoListaSecundariaAdjacencia prox;

    public NoListaSecundariaAdjacencia(NoAdjacencia disciplina) {
        this.disciplina = disciplina;
        this.prox = null;
    }

    public NoAdjacencia getNoAdjacencia() {
        return disciplina;
    }

    public void setNoAdjacencia(NoAdjacencia disciplina) {
        this.disciplina = disciplina;
    }

    public NoListaSecundariaAdjacencia getProx() {
        return prox;
    }

    public void setProx(NoListaSecundariaAdjacencia prox) {
        this.prox = prox;
    }
}