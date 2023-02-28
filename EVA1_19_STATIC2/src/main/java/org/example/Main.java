package org.example;

public class Main {
    int x=100;

    public static void main(String[] args) {
        //System.out.println(x);
        //mensajenoestatico();
        Main obj = new Main();
        System.out.println(obj.x);
        obj.mensajenoestatico();
        mensajeestatico();
    }
    public void mensajenoestatico(){//No existe
        System.out.println("MENSAJE NO ESTATICO");
    }
    public static void mensajeestatico(){//Existe al iniciar el programa
        System.out.println("MENSAJE ESTATICO");
    }

}