package Lista01;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner numeroEleitores = new Scanner(System.in);
        System.out.println("Informe o número de Eleitores");
        int nE = numeroEleitores.nextInt();

        Scanner votosBrancos = new Scanner(System.in);
        System.out.println("Informe o número de votos em Branco");
        int vB = votosBrancos.nextInt();

        Scanner votosNulos = new Scanner(System.in);
        System.out.println("Informe o número de votos Nulos");
        int vN = votosNulos.nextInt();

        Scanner votosValidos = new Scanner(System.in);
        System.out.println("Informe o número de votos Validos");
        int vV = votosValidos.nextInt();


    }



}
