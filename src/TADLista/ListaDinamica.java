package TADLista;

public class ListaDinamica<T> {
    private Node<T> inicio;
    private int tamanho;

    private static class Node<T> {
        T valor;
        Node<T> proximo;

        public Node(T valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public ListaDinamica() {
        inicio = null;
        tamanho = 0;
    }

    public void inserirInicio(T elemento) {
        Node<T> novoNode = new Node<>(elemento);
        novoNode.proximo = inicio;
        inicio = novoNode;
        tamanho++;
    }

    public void inserirFim(T elemento) {
        if (inicio == null) {
            inicio = new Node<>(elemento);
        } else {
            Node<T> atual = inicio;
            while (atual.proximo!= null) {
                atual = atual.proximo;
            }
            atual.proximo = new Node<>(elemento);
        }
        tamanho++;
    }

    public T removerInicio() {
        if (inicio == null) {
            return null;
        }
        T valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;
        return valorRemovido;
    }

    public T removerFim() {
        if (inicio == null) {
            return null;
        }
        if (inicio.proximo == null) {
            T valorRemovido = inicio.valor;
            inicio = null;
            tamanho--;
            return valorRemovido;
        }
        Node<T> atual = inicio;
        while (atual.proximo.proximo!= null) {
            atual = atual.proximo;
        }
        T valorRemovido = atual.proximo.valor;
        atual.proximo = null;
        tamanho--;
        return valorRemovido;
    }
    public boolean vazia() {
        return inicio == null;
    }
    public int tamanho() {
        return tamanho;
    }
}



