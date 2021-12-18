package Lista01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RetornaPorcentagem {
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR --> ");
        int primeiroValor = v1.nextInt();

        Scanner v2 = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR -->");
        int segundoValor = v2.nextInt();

        System.out.println("Acrécimo de 30% --> " + (primeiroValor+primeiroValor*30/100));
        System.out.println("Desconto de 25% --> " + (segundoValor-segundoValor*25/100));



    }
}
