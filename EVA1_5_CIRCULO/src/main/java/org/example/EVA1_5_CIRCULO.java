package org.example;
import java.util.Scanner;

public class EVA1_5_CIRCULO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo cc = new Circulo();
        System.out.println("Ingrese la medida del radio");
        cc.setRadio(sc.nextDouble());
        cc.setArea(0);
        cc.setPerimetro(0);
        cc.imprimirDatos();
        cc.imprimirA();
    }
}