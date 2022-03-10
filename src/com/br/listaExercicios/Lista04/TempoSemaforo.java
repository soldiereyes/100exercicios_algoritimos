package com.br.listaExercicios.Lista04;

import java.util.Scanner;

public class TempoSemaforo {

    public static void main(String[] args) {
        // Captura e armazena os valores das variaveis
        System.out.println(" Informe o valor da distancia entre os semaforos em metros: ");
        Scanner objetoDistancia = new Scanner(System.in);
        float armazenaDistanciaEntreSemaforos = objetoDistancia.nextFloat();

        System.out.println(" Informe o valor da velocidade permitida na via em metros por segundo m/s: ");
        Scanner objetoVelocidade = new Scanner(System.in);
        float armazenaVelociadaPermitida = objetoVelocidade.nextFloat();

        System.out.println(" Informe o valor da aceleração do carro em metros por segundo por segundo m/s²: ");
        Scanner objetoAceleracao = new Scanner(System.in);
        float armazenaAceleracaoDoCarro = objetoAceleracao.nextFloat();

        System.out.println(calculaTempoEntreSemaforos(armazenaDistanciaEntreSemaforos, armazenaVelociadaPermitida, armazenaAceleracaoDoCarro));
    }

    public static double calculaTempoEntreSemaforos(float distancia, float velocidade, float aceleracao){
        return Math.sqrt(2*distancia/aceleracao);
    }

}
