package com.br.listaExercicios.Lista02;

import java.util.Scanner;

public class SomaDosMaiores {
    public static void main(String[] args) {


        Scanner valorInserido1 = new Scanner(System.in);
        System.out.println("Insira o valor do primeiro número -->  ");
        int valor1 = valorInserido1.nextInt();

        Scanner valorInserido2 = new Scanner(System.in);
        System.out.println("Insira o valor do segundo número -->  ");
        int valor2 = valorInserido1.nextInt();

        Scanner valorInserido3 = new Scanner(System.in);
        System.out.println("Insira o valor do terceiro número -->  ");
        int valor3 = valorInserido1.nextInt();

        ordena(valor1, valor2, valor3);
    }

    private static void ordena(int x, int y, int z) {
        if (x>y & y>z){
            System.out.println("A maior soma é: "+ (x+y));
        }else if(y>z & z>x){
            System.out.println("O maior valor é: "+ (y+z));
        }else{
            System.out.println("o maior valor é: " + (z+x));
        }
    }
}
