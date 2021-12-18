package Lista02;

import java.util.Scanner;

/**
 * Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere
 * que o N será sempre maior que ZERO.
 */

public class ImprimeValores {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int nn = n.nextInt();

        imprimeValor(nn);
//        validaN(nn);
    }

//    public static void validaN(int x) {
//        if (x>0){
//        }
//    }

    public static void  imprimeValor(int x) {
        int inicio = 1;
        while (inicio <= x) {
            if(x>0) {
                System.out.println(inicio);
                inicio++;
            }else {
                imprimeValor(x);
            }
        }
    }
}
