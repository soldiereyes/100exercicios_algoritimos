package com.br.listaExercicios.Lista01.Lista02;

import java.util.Scanner;

/**
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
 * uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
 * aluno é aprovado). Escrever também a média calculada.
 *
 */


public class CalculaMedia {
    public static void main(String[] args) {
        Scanner valorInserido1 = new Scanner(System.in);
        System.out.println("Insira o valor da primeira nota -->  ");
        double valor1 = valorInserido1.nextDouble();

        Scanner valorInserido2 = new Scanner(System.in);
        System.out.println("Insira o valor da segunda nota -->  ");
        double valor2 = valorInserido2.nextDouble();

        calculaMedia(valor1, valor2);
    }

    public static void calculaMedia(double x, double y) {
        double media = (x + y) / 2;
        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        System.out.println("O aluno obteve média final " + media);
    }
}
