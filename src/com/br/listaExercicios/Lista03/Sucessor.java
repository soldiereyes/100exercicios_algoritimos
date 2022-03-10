package com.br.listaExercicios.Lista03;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        System.out.print("Digite um numero --> ");
        Scanner inputNumero = new Scanner(System.in);

        int coletaInputNumero = inputNumero.nextInt();

        System.out.println("O sucessor so numero "+coletaInputNumero + " => "+(coletaInputNumero +1) );
    }

}
