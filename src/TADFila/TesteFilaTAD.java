package TADFila;


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




    }
}


