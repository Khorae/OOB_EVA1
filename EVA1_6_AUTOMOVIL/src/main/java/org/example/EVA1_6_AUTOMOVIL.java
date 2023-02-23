package org.example;

import java.util.Scanner;

public class EVA1_6_AUTOMOVIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automovil at = new Automovil();
        at.setDueño(sc.next());
        at.setAño(sc.nextInt());
        at.setMarca(sc.next());
        at.setModelo(sc.next());
        at.setPlaca(sc.next());
        at.imprimirDatos();
    }
}