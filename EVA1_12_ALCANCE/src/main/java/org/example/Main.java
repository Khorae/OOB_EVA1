package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(x); //No existe la x, porque esta declarada despues de la instruccion.
        System.out.println(args);//Existe porque se declara antes de la instruccion
        int x = 100;
        System.out.println(x);
    }
}