package com.br.listaExercicios.Lista01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Crie um programa que armazene nomes didgitados pelo usuário em uma lista. Ao final o programa deve
 * exibir todos os nomes em odem alfabética
 *
 */

public class ListaDeNomes {

    public static void main(String[] args) {
        Scanner leitorNomes = new Scanner(System.in);// Captura de nomes
        List<String> nomes = new ArrayList<String>(); // organização em lista

        System.out.println("Insira 5 leitorNomes: ");
        nomes.add(leitorNomes.next());// inserindo nomes dentro da lista
        nomes.add(leitorNomes.next());
        nomes.add(leitorNomes.next());
        nomes.add(leitorNomes.next());
        nomes.add(leitorNomes.next());
        Collections.sort(nomes);// colocando nomes em ordem alfabética

        System.out.println(nomes);

    }
}

