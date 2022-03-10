package com.br.listaExercicios.Lista03.ConverteEmBinario;

public class ConveteBinario {
    public String binario(int decimal) {
        int numero = decimal;
        String binario = " ";
        String binarioocontrario = " ";

        while (numero < 32 && numero != 0) {
            binario += " " + numero % 2;
            numero = numero / 2;
            System.out.println(numero);
        }
        for (int i = (binario.length()); i != 0; i--) {
            binarioocontrario += " " + binario.charAt(i - 1);
        }
        return binarioocontrario;
    }
}
