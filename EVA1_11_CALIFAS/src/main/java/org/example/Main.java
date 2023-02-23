package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("La calificacion es: "+califa(81));
    }
    public  static String califa(int puntaje){
        String calif = null;
        if (puntaje>=91 && puntaje<=100){
            calif = "A";
        } else if (puntaje>=81 && puntaje<=90) {
            calif = "B";
        } else if (puntaje >= 71 && puntaje<=80) {
            calif = "C";
        } else {
            calif = "D";
        }
        return calif;

    }
}