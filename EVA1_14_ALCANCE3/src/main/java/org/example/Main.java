package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Se declara un scanner para crear un valor limite dependiente del usuario
        System.out.println("Valor de la variable n ");
        int n = sc.nextInt();//Se inicializa la varianle n y se le adjudica una entrada de tipo entero
        int x = 100;//Declara valor de variable
        int y = 1000;//Declara valor de variable
        System.out.println(x); //Visible dentro de todo el main
        for (int i=0;i<n;i++){
             x = 100; //No se puede, ya existe en el main
            System.out.println(i);
            System.out.println(x);//Visible dentro de todo el main
            if (i==5){
                System.out.println(y);//Visible dentro de todo el main
            }
        }
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    public static void Algo(int x){

    }
    public static void Algo2(int x){

    }
}