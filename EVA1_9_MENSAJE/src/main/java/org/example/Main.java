package org.example;

public class Main {
    public static void nPrintln(String message, int n){
        for (int i=0;i=n;i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        nPrintln("Hola",5);
    }
}