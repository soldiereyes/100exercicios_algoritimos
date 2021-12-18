package com.br.listaExercicios.Lista01;

public class TrocaVariavel {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a += b; // 30
//        System.out.println(a);
        b = a -= b; // 10
//        System.out.println(b);
//        a = a -= b;
        System.out.println(b);


    }
}
