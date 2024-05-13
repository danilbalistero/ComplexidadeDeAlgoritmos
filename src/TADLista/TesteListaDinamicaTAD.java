package TADLista;

import TADLista.ListaDinamica;

public class TesteListaDinamicaTAD {
    public static void main(String[] args) {
        ListaDinamica<Integer> lista = new ListaDinamica<>();

        lista.inserirInicio(3);
        lista.inserirInicio(7);
        lista.inserirInicio(9);

        lista.inserirFim(89);

        System.out.println("Elemento removido do início: " + lista.removerInicio());

        System.out.println("Elemento removido do fim: " + lista.removerFim());

        System.out.println("Lista vazia? " + lista.vazia());

        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}
