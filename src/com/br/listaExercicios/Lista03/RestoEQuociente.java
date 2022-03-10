package com.br.listaExercicios.Lista03;

import java.util.Scanner;

public class RestoEQuociente {

    public static void main(String[] args) {

        System.out.print("Digite um numero -> ");
        Scanner inputNumero1 = new Scanner(System.in);
        float armazenaNumero1 = inputNumero1.nextFloat();


        System.out.print("Digite um numero -> ");
        Scanner inputNumero2 = new Scanner(System.in);
        float armazenaNumero2 = inputNumero2.nextFloat();

        System.out.println("Resto "+ calculaResto(armazenaNumero1, armazenaNumero2) + " Quociente "
                + calculaQuociente(armazenaNumero1, armazenaNumero2) );
    }



    public static float calculaResto(float numero1, float numero2 ){
        return numero1/numero2;
    }

    public static float calculaQuociente(float numero1, float numero2){
        return numero1%numero2;

    }
}
