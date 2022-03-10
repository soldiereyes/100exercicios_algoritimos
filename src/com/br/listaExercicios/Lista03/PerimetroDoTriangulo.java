package com.br.listaExercicios.Lista03;

public class PerimetroDoTriangulo {

    public static int calculaPerimetroDoTriangulo(int lado1, int lado2, int lado3){
        return lado1+lado2+lado3;
    }

    public static void main(String[] args) {
        System.out.println(calculaPerimetroDoTriangulo(3 , 4 , 5 ));
    }

}
