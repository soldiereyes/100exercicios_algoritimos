package com.br.listaExercicios.Lista01;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie um programa que crie alunos com nome, serie e notas (3)
 * Quando todoas os alunos forem criedos e armazenados liste
 * os alunos por serie e exiba a media das notas deles.
 */
  class Alunos {
    String nome;
    int serie;
    int nota;
}
public class MediaAlunos {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        aluno1.nome = "Guilherme";
        aluno1.serie = 1;
        aluno1.nota = 10;

        Alunos aluno2 = new Alunos();
        aluno2.nome = "Geovana";
        aluno2.serie = 2;
        aluno2.nota = 9;

        Alunos aluno3 = new Alunos();
        aluno3.nome = "Caroline";
        aluno3.serie = 3;
        aluno3.nota = 7;

        List<Alunos> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println(alunos);

        ordenaSerie();
        mediaDeNotas();
    }

    public static void mediaDeNotas() {
    }

    public static void ordenaSerie() {
    }


}
