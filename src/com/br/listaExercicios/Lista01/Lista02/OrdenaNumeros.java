package com.br.listaExercicios.Lista01.Lista02;

import java.util.Scanner;
/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
 */



public class OrdenaNumeros {
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

        ordena(valor1,valor2,valor3);

    }

    private static void ordena(int x, int c, int v) {
        if (x>c){
            System.out.println("O maior valor é: "+ x);
        }else if(c>v){
            System.out.println("O maior valor é: "+ c);
        }else{
            System.out.println("o maior valor é: " + v);
        }
        
    }
}
