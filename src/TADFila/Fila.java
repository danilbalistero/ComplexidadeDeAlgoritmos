package TADFila;

import java.util.Stack;

public class Fila<T> {
    private Node<T> inicio;
    private Node<T> fim;
    private int tamanho;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public Fila() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void enfileirar(T elemento) {
        Node<T> novoNode = new Node<>(elemento);
        if (estaVazia()) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.next = novoNode;
            fim = novoNode;
        }
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) {
            System.out.println("Erro: Fila vazia");
            return null;
        } else {
            T elementoRemovido = inicio.data;
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            tamanho--;
            return elementoRemovido;
        }
    }

    public boolean estaVazia() {
        return (inicio == null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> atual = inicio;
        while (atual != null) {
            builder.append(atual.data).append(" ");
            atual = atual.next;
        }
        return builder.toString();
    }

    public void inverterFila() {
        if (estaVazia()) {
            return;
        }
        T elemento = desenfileirar();
        inverterFila();
        enfileirar(elemento);
    }

}


