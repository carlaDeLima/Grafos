package lista_adjacencia;

import disciplinas.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class ListaAdjacencia {

    private NoAdjacencia primeiro;
    private NoAdjacencia ultimo;

    public ListaAdjacencia() {
        this.primeiro = null;
    }

    void inserirFinal(int valor, Disciplina disciplina) {
        NoAdjacencia novo = new NoAdjacencia(valor, disciplina);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        NoAdjacencia aux = primeiro;
        if (primeiro == null) {
            System.err.println("Lista vazia");
        }
        while (aux != null) {
            System.out.println(aux.getDisciplina().getNome() + " ");
            aux.getLista().exibir();
            aux = aux.getProx();
        }
    }

    public void exibirBusca() {
        NoAdjacencia aux = primeiro;
        if (primeiro == null) {
            System.err.println("Lista vazia");
        }
        System.out.print("\t|");
        while (aux != null) {
            System.out.print("\t" + aux.getDisciplina().getNome() + "\t\t|");
            aux = aux.getProx();
        }
    }

    public List<NoAdjacencia> busarNoAdjacencia(String codigo) {
        List<NoAdjacencia> auxList = new ArrayList<>();
        NoAdjacencia aux = primeiro;
        if (primeiro == null) {
            System.err.println("Lista vazia");
        }
        while (aux != null) {
            for (int i = 0; i < aux.getDisciplina().getPreRequisitos().length; i++) {
                if (codigo.equals(aux.getDisciplina().getPreRequisitos()[i].getCodigo())){
                    auxList.add(aux);
                }
            }
            aux = aux.getProx();
        }
        return auxList;
    }

    public boolean buscarVertice(int vertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if (aux.getValor() == vertice) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public Integer buscaVertice(Integer vertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if (aux.getValor() == vertice) {
                return aux.getValor();
            }
            aux = aux.getProx();
        }
        return null;
    }

    public boolean buscarVerticeNumero(int vertice, int primeiroVertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if (aux.getValor() == vertice) {
                if (aux.getLista().buscarVertice(primeiroVertice)) {
                    return true;
                }
            }
            aux = aux.getProx();
        }
        return false;
    }

    public NoAdjacencia getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoAdjacencia primeiro) {
        this.primeiro = primeiro;
    }

    public NoAdjacencia getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoAdjacencia ultimo) {
        this.ultimo = ultimo;
    }

    ////Busca////
    public ListaSecundariaAdjacencia buscarListaSecundaria(int vertice) {
        NoAdjacencia aux = primeiro;
        while (aux != null) {
            if (aux.getValor() == vertice) {
                return aux.getLista();
            }
            aux = aux.getProx();
        }
        return null;
    }

}