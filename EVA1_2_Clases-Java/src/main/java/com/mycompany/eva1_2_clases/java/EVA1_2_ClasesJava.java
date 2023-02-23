package com.mycompany.eva1_2_clases.java;

public class EVA1_2_ClasesJava {

    public static void main(String[] args) {
        // Creacion objeto
        // Instanciacion
        // Instanciar --> Dar memoria RAM
        // nombre de la clase, identificador =new Construccion de la clase();
        Persona perso1 = new Persona(); // Persona () es el contstructor (definir)
        /*
         * perso1.apellidos = "Fernandez Bordier";
         * perso1.nombre = "Raul";
         * System.out.println(perso1.nombre+" "+perso1.apellidos);
         */
        perso1.setNombre("Raul"); // Asignar valor
        perso1.setApellidos("Fernandez Bordier");
        perso1.setEdad(18);
        perso1.setGenero('M');
        /*
         * System.out.println(perso1.getNombre()); //Leer valor
         * System.out.println(perso1.getApellidos());
         * System.out.println(perso1.getEdad());
         * System.out.println(perso1.getGenero ());
         */
        perso1.imprimirDatos();
    }
}
