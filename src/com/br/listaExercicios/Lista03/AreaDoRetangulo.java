package com.br.listaExercicios.Lista03;

/**
 * Dado o tamanho da base e da altura do retangulo, calcular a sua area e o seu perimetro
 */
public class AreaDoRetangulo {
    int lado1DoRetangulo;
    int lado2DoRetangulo;

    static int calculaArea(int lado1DoRetangulo, int lado2DoRetangulo){
       int  areaDoRetangulo = lado1DoRetangulo * lado2DoRetangulo;
       return areaDoRetangulo;
    }
    static int calculaPerimetro(int lado1DoRetangulo,int lado2DoRetangulo){
       int perimetroDoRetangulo =2*( lado1DoRetangulo + lado2DoRetangulo);
        return perimetroDoRetangulo;
    }

    public static void main(String[] args) {
        System.out.println(calculaArea (5, 10  ));
        System.out.println(calculaPerimetro(5, 10));
    }
}