package Lista01;

import java.util.Scanner;

/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
 * distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
 * seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
 * calcular e escrever o custo final ao consumidor.
 */
public class CustoCarro {
    public static void main(String[] args) {
        Scanner lerCarro = new Scanner(System.in);
        System.out.println("Informe o valor do veículo:  ");
        double car = lerCarro.nextDouble();
        System.out.println(" ");

        calculaTaxa(car);
    }

    public static void calculaTaxa(double x) {
        System.out.println(x + (x * 0.28 + x * 0.45));
    }
}

