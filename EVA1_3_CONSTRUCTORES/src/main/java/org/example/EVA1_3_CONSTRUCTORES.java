package org.example;

public class EVA1_3_CONSTRUCTORES {
    public static void main(String[] args) {
        // CLASE IDENTIFICADOR = new CONSTRUCTOR();
        CuentaBancaria cuenta1 = new CuentaBancaria("540",10000,"Alejandro");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getnomCliente());
        System.out.println(cuenta1.getsaldo());
        System.out.println(cuenta1.getnocuenta());

        CuentaBancaria cuenta2 = new CuentaBancaria("500",155, "Carlos");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getnomCliente());
        System.out.println(cuenta2.getsaldo());
        System.out.println(cuenta2.getnocuenta());

        CuentaBancaria cuenta3 = new CuentaBancaria("287",19, "Maria");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getnomCliente());
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getnocuenta());
    }
}