package com.br.listaExercicios.Lista01.Lista02;

import java.util.Scanner;

/**
 * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
 * contrário escrever NÃO É MAIOR QUE 10!
 */


public class TestaCondição {
    public static void main(String[] args) {
        Scanner valorInserido = new Scanner(System.in);
        System.out.println("Insira um valor inteiro-->  ");

        int valor = valorInserido.nextInt();

        testaCondicao(valor);
    }

    public static void testaCondicao(int x) {
        if (x > 10) {
            System.out.println("É MAIOR DO QUE 10 ");
        }else {
            System.out.println("É MENOR DO QUE 10 ");
        }
    }
}
