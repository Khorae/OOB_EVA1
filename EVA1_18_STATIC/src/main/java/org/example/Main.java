package org.example;

public class Main {
    public static void main(String[] args) {
        Prueba p1 = new Prueba();
        p1.mensaje();
        Otra.mensajeestatico();
        System.out.println("Pi: "+Math.PI);
    }
}
    class Prueba{
        public void mensaje(){ //Solo al crear objetos
            System.out.println("HOLA!!!!");
    }
}
    class Otra{
        public static void mensajeestatico(){//Directamente de la clase
            System.out.println("HOLA (ESTATICO)!!!");
    }
}