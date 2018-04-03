package busca_largura;

public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista() {
        this.primeiro = null;
    }

    void removerInicio(){
        No aux = primeiro;
        if (primeiro == null) {
            System.err.println("Fila vazia");
        }else {
            primeiro = primeiro.getProx();
        }
    }

    void inserirFinal(Cor color, int distancia, int pai) {
        No novo = new No(color, distancia, pai);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProx(novo);
            ultimo = novo;
        }
    }

    public void exibir() {
        No aux = primeiro;
        if(primeiro == null){
            System.err.println("Fila vazia");
        }
        while (aux != null) {
            System.out.println(aux.getColor() + " ");
            /*if (aux.getProx() != null){
                System.out.println(aux.getProx().getColor() + " ");
            }*/
            aux = aux.getProx();
        }
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
}
