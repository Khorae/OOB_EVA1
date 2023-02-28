package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("LA SUMA ES: "+suma(5,7));
        System.out.println("LA SUMA ES: "+suma(5.6,6.4));
        System.out.println("LA SUMA ES: "+suma("Hola ","Mundo!"));
        suma();
    }
    //suma de dos números
    public static int suma(int n1, int n2){
        return n1+n2;
    }
    public static double suma(double n1, double n2){
        return n1+n2;
    }
    public static String suma(String n1, String n2){
        return n1+n2;
    }
    public static void suma(){
        System.out.println("Suma: Sin argumentos");
    }
}