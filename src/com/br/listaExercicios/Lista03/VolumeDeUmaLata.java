package com.br.listaExercicios.Lista03;

public class VolumeDeUmaLata {
    public static void main(String[] args) {
        System.out.println(calculaVolumeDaLata(2, 3));
    }
    public static float calculaVolumeDaLata(float raio, float altura){
        return (float) ((Math.PI)*(raio*raio)*altura);
    }
}
