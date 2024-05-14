package TADFila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Fila<T extends Comparable<T>> {
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

    public static boolean verificarPalindromo(String palavra) {
        palavra = palavra.toLowerCase().replaceAll("[^a-z]", "");

        Fila<Character> fila = new Fila<>();
        StringBuilder inverso = new StringBuilder();

        for (char c : palavra.toCharArray()) {
            fila.enfileirar(c);
        }
        while (!fila.estaVazia()) {
            inverso.append(fila.desenfileirar());
        }
        return palavra.equals(inverso.reverse().toString());
    }

    public void ordenarFila() {
        if (estaVazia()) {
            return;
        }
        List<T> elementos = new ArrayList<>();
        while (!estaVazia()) {
            elementos.add(desenfileirar());
        }
        Collections.sort(elementos);
        for (T elemento : elementos) {
            enfileirar(elemento);
        }
    }
}


