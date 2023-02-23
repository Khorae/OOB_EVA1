package org.example;
public class Circulo {
    private double area;
    private double perimetro;
    private double radio;
    private String a;
    public Circulo() {
        area = 0;
        perimetro = 0;
        radio = 0;
    }
    public double getPerimetro(){
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    public double setPerimetro(double valor){
        perimetro = valor;
        return area;
    }
    public double getArea(){
        area = Math.PI*(radio*radio);
        return area;
    }
    public double setArea(double valor){
        area = valor;
        return area;
    }
    public double getRadio(){
        return radio;
        
    }
    public void setRadio( double valor) {
        radio = valor;

    }

    public void imprimirDatos (){
        area = getArea();
        perimetro = getPerimetro();
        radio = getRadio();
        System.out.println("El valor del area y perimetro cuando el circulo tiene un radio de: "+radio+" cm.");
        System.out.println("");
        System.out.println("El valor del area es de: "+area+" cm.");
        System.out.println("El valor del perimetro es de: "+perimetro+" cm.");
    }
}

