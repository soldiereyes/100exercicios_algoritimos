package Lista01;

import javax.swing.plaf.synth.SynthPopupMenuUI;
import java.util.Scanner;

public class MyClass1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um número -> ");
        int b = a.nextInt();

        System.out.println(retornaAntecessor(b));
    }
    public static int retornaAntecessor(int x) {
        return --x;
    }
}
