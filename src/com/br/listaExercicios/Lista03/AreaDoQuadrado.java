package com.br.listaExercicios.Lista03;

/**
 * Dado o tamanho do lado do quadrado calcular a área e o perímetro do mesmo.
 */

public class AreaDoQuadrado {


    public static int calculaAreaDoQuadrado (int ladoDoQuadrado) {
        return  ladoDoQuadrado*ladoDoQuadrado;
    }
    public static int calculaPerimetroDoQuadrado(int ladoDoQuadrado){
        return  4*ladoDoQuadrado;
    }
    public static void main(String[] args) {
        System.out.println("A área do quadrado é - " + calculaAreaDoQuadrado(5));
        System.out.println("O perimetro do quadrado é - " + calculaPerimetroDoQuadrado(10));

    }

}
