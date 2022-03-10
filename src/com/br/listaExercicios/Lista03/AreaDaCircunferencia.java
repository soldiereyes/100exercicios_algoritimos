package com.br.listaExercicios.Lista03;

/**
 * Dado o tamanho do raia de uma circinferência, clacular a área e o perímetro da mesma
 */

public class AreaDaCircunferencia {

    public static float calculaAreaDaCircunferencia(int raioDaCircunferencia){
        return (float) (Math.PI*(raioDaCircunferencia*raioDaCircunferencia));
    }
    public static float calculaPerimetroDaCircunferencia(int raioDaCircunferencia){
        return (float) (2*Math.PI*raioDaCircunferencia);
    }

    public static void main(String[] args) {
        System.out.println(calculaAreaDaCircunferencia(5));
        System.out.println(calculaPerimetroDaCircunferencia(5));
    }

}
