package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x); //Visible dentro de todo el main
        for (int i=0;i<10;i++){
            int x = 100; //No se puede, ya existe en el main
            System.out.println(i);
            System.out.println(x);//Visible dentro de todo el main
            if (i==5){
                System.out.println(x);//Visible dentro de todo el main
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