package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
            System.out.println(x);
            int x = 100;
            System.out.println(x);
            {
                int y = 1000;
                System.out.println(y);
            }
            System.out.println(y);
        }
        System.out.println(i);
        System.out.println(x);
    }
}