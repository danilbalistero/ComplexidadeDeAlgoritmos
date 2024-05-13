package TADFila;


import static TADFila.Fila.verificarPalindromo;

public class TesteFilaTAD {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println("A fila está vazia? " + fila.estaVazia());

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(45);
        fila.enfileirar(67);
        fila.enfileirar(2);
        fila.enfileirar(89);

        System.out.println("Tamanho da fila: " + fila.tamanho());

        //desinfileirando
        System.out.println("Elemento desenfileirado: " + fila.desenfileirar());
        System.out.println("Elemento desenfileirado: " + fila.desenfileirar());

        //invertendo a ordem da fila
        System.out.println("Fila original: " + fila);
        fila.inverterFila();
        System.out.println("Fila invertida: " + fila);


        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("A fila está vazia? " + fila.estaVazia());

        String palavra1 = "radar";
        String palavra2 = "reconhecer";
        String palavra3 = "casa";

        System.out.println(palavra1 + " é um palíndromo? " + verificarPalindromo(palavra1));
        System.out.println(palavra2 + " é um palíndromo? " + verificarPalindromo(palavra2));
        System.out.println(palavra3 + " é um palíndromo? " + verificarPalindromo(palavra3));

    }

    }



