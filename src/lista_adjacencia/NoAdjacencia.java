package lista_adjacencia;

import disciplinas.Disciplina;

public class NoAdjacencia {

    private int valor;
    private Disciplina disciplina;
    private ListaSecundariaAdjacencia lista;
    private NoAdjacencia prox;

    public NoAdjacencia(int valor, Disciplina disciplina) {
        this.valor = valor;
        this.disciplina = disciplina;
        this.lista = null;
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