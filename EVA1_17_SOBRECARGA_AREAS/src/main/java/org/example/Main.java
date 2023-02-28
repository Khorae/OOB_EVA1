package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circulo: "+areacirculo(5));
        System.out.println("Triangulo: "+areatriangulo(6.4,8.7));
        System.out.println("Trapecio: "+areatrapecio(7.9, 9.3, 4.6));
    }
    public static double areacirculo(double radio){
        return Math.PI*Math.pow(radio,2);
    }
    public static double areatriangulo(double base, double altura){
        return (base*altura)/2;
    }
    public static double areatrapecio(double basemayor, double basemenor, double altura){
        return ((basemayor+basemenor)*altura)/2;
    }
}