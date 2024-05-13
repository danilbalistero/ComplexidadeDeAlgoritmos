package TADFila;


public class TesteFilaTAD {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println("A fila está vazia? " + fila.estaVazia());

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("Elemento desenfileirado: " + fila.desenfileirar());
        //System.out.println("Elemento desenfileirado: " + fila.desenfileirar());

        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("A fila está vazia? " + fila.estaVazia());

    }
}


