package com.br.listaExercicios.Lista01.Lista02;
import java.util.Scanner;

/**
 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
 * compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
 * escreva o custo total da compra.
 */
public class PrecoDaMaca {
    public static void main(String[] args) {

        Scanner valorInserido = new Scanner(System.in);
        System.out.println("Insira a quantidade de maçãs -->  ");
        int valor = valorInserido.nextInt();

        calculaPreco(valor);
    }

    public static void calculaPreco(int x) {
        double precoMaca = 1.30;
        double precoMacaPromocional = 1.00;

        if (x < 12) {
            System.out.println("Valor total da compra: " + (x * precoMaca));
        }else if (x == 12){
            System.out.println("Valor total da compra: " + ( x * precoMacaPromocional));
        }else {
            System.out.println("Valor total da compra: " + ( x * precoMacaPromocional));
        }
    }
}
