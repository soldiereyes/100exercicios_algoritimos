package com.br.listaExercicios.Lista02;

import java.util.Scanner;
/**
 * Ler um valor e escrever se é positivo ou negativo
 * (considere o valor zero como positivo).
 */

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner valorInserido = new Scanner(System.in);
        System.out.println("Insira um valor inteiro-->  ");

        int valor = valorInserido.nextInt();

        testaCondicao(valor);
    }

    public static void testaCondicao(int x) {
        if (x > 0) {
            System.out.println(" POSITIVO ");
        } else if (x == 0) {
            System.out.println(" POSITIVO ");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}

