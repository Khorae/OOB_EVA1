package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void A() {
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B() {
        System.out.println("INICIA B()");

        System.out.println("TERMINA B()");
    }
    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA main()");

    }

}