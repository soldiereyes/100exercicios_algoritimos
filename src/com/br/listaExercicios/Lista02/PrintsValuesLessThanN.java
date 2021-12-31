package com.br.listaExercicios.Lista02;

import java.util.Scanner;

/**
 * Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere
 * que o N será sempre maior que ZERO.
 */

public class PrintsValuesLessThanN{
    public static void main(String[] args) {
        Scanner storeValue = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int storeObject = storeValue.nextInt();
        returnRange(storeObject);
    }

    private static void returnRange(int referenceStoreObject) {
        int initialRange = 1;
        if (referenceStoreObject >= 1) {
            do {
                System.out.println(initialRange);
                initialRange++;
            } while (initialRange <= referenceStoreObject);
        }
        returnRange(referenceStoreObject);
    }
}
