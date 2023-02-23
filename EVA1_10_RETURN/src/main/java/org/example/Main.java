package org.example;

public class Main {
    public static int square(int num){
        return num * num;
    }
    public static void main(String[] args) {
        square(10); //Llamada a funcion sin procesar el resultado
        int resu = square(3);
        System.out.println(resu);
        System.out.println(square(10));
    }
}