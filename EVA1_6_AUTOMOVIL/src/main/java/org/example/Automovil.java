package org.example;

public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    private String dueño;
    private String placa;
    private int adeudo;
     void automovil(){
        marca = null;
        modelo = null;
        año = 0;
        dueño = null;
        placa = null;
        adeudo = 0;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getDueño(){
        return dueño;
    }
    public String getPlaca(){
        return placa;
    }
    public int getAño(){
        return año;
    }
    public int getAdeudo(){
        switch (año){
            case 2001,2002,2003,2004,2005:
                    adeudo = 2000;
            break;
            case 2006,2007,2008,2009,2010:
                    adeudo = 2500;
            break;
            case 2011,2012,2013,2014,2015:
                    adeudo = 3000;
            break;
            case 2016,2017,2018,2019,2020,2021,2023:
                    adeudo = 4000;
            break;
            default:
                adeudo = 1500;
        }
        return adeudo;
    }
    public void setMarca(String valor){
        marca = valor;
    }

    public void setAño(int valor) {
        año = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setDueño (String valor){
        dueño = valor;
    }
    public void setPlaca (String valor){
        placa = valor;
    }

    public void imprimirDatos(){
        placa = getPlaca();
        dueño = getDueño();
        año = getAño();
        modelo = getModelo();
        marca = getMarca();
        adeudo = getAdeudo();
        System.out.println("La placa es: "+placa+".");
        System.out.println("El nombre del dueño es: "+dueño+".");
        System.out.println("La marca del vehiculo es: "+marca+".");
        System.out.println("El modelo del vehiculo es: "+modelo+".");
        System.out.println("El año del vehiculo es: "+año);
        System.out.println("El adeudo del vehiculo es de: $"+adeudo+" M.n.");
    }
}
