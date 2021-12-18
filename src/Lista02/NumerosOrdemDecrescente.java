package Lista02;

/**
 * Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem
 * decrescente.
 */

public class NumerosOrdemDecrescente {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            --i;
        }
    }
}
