package busca_largura;

import disciplinas.Disciplina;

public class NoFila {
    private int valor;
    private Disciplina disciplina;
    private NoFila prox;

    public NoFila(int valor) {
        this.valor = valor;
        //this.disciplina = disciplina;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public NoFila getProx() {
        return prox;
    }

    public void setProx(NoFila prox) {
        this.prox = prox;
    }
}
