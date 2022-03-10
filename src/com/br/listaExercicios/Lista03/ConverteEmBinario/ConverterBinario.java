package com.br.listaExercicios.Lista03.ConverteEmBinario;

import javax.swing.*;

public class ConverterBinario {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        ConveteBinario conveter = new ConveteBinario();

        JOptionPane.showInputDialog(null, "Binario: " + conveter.binario(numero));
    }


}
