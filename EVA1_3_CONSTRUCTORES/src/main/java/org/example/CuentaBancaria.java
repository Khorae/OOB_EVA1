package org.example;

public class CuentaBancaria {
    private double saldo;
    private String nocuenta;
    private String nomCliente;

    //CONSTRUCTOR:
    // MODIFICADOR DE ACCESSO NOMBRE DE LA CLASE (ARGUMENTOS)
    public CuentaBancaria(){ //CONSTRUCTOR DEFAULT
        nocuenta = "null";
        saldo = 0;
        nomCliente = "null";
    }
    public CuentaBancaria(String nCuenta, double cant, String nCliente){
        nocuenta=nCuenta;
        saldo = cant;
        nomCliente = nCliente;
    }


    //Métodos get y set
    public String getnocuenta(){
        return nocuenta;
    }

    public double getsaldo(){
        return saldo;
    }
    public String getnomCliente(){
        return nomCliente;
    }

    public void setnocuenta(String valor){
        nocuenta = valor;
    }

    public void setsaldo(double valor){
        saldo = valor;
    }

    public void setnomCliente(String valor){
        nomCliente = valor;
    }
}
