package com.br.listaExercicios.Lista01;

import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner salarioFixo = new Scanner(System.in);
        System.out.println("Salário Fixo: ");
        double sf = salarioFixo.nextDouble();

        Scanner totalVendas = new Scanner(System.in);
        System.out.println("Total de vendas: ");
        int tv = totalVendas.nextInt();

        System.out.println("Salário do vendedor -> " + sf);
        System.out.println("Comissão->  " +(sf*15/100));
        System.out.println("Salário final -> "+ (sf+tv*(sf*15/100)));

    }
}
