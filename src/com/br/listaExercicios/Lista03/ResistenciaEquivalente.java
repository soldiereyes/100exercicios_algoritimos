package com.br.listaExercicios.Lista03;

import java.util.Scanner;

public class ResistenciaEquivalente {

    public static void main(String[] args) {
        // Captura e armazena os valores das tres resistencias
        System.out.println(" Informe o valor da primeira resistencia: ");
        Scanner objetoResistencia1 = new Scanner(System.in);
        float armazenaPrimeiro = objetoResistencia1.nextFloat();

        System.out.println(" Informe o valor da segunda resistencia: ");
        Scanner objetoResistencia2 = new Scanner(System.in);
        float armazenaSegundo = objetoResistencia2.nextFloat();

        System.out.println(" Informe o valor da segunda resistencia: ");
        Scanner objetoResistencia3 = new Scanner(System.in);
        float armazenaTerceiro = objetoResistencia3.nextFloat();

        System.out.println(calcularResistenciaEmParalelo(armazenaPrimeiro, armazenaSegundo ));

        System.out.println(calcularResistenciaEquivalente(armazenaPrimeiro, armazenaSegundo, armazenaTerceiro));

    }
    // metodo para calcular resistencia em paralelo

    public static float calcularResistenciaEmParalelo(float resistencia1, float resistencia2){
       float RESISTENCIAPARALELO =  (resistencia1*resistencia2)/(resistencia1+resistencia2);
       return RESISTENCIAPARALELO;
    }
    // metodo para calcular resistencia equivalente
    public static float calcularResistenciaEquivalente( float resistencia1,float resistencia2, float resistencia3){
        float RESISTENCIAPARALELO = (resistencia1*resistencia2)/(resistencia1+resistencia2);
         return RESISTENCIAPARALELO + resistencia3;
    }





}
