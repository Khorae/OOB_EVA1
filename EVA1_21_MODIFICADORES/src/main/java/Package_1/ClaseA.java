package Package_1;

import Package_2.ClaseE;

public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba(){
        //TODAS LAS CLASES ESTAN EN PAQUETE1
        //MISMO PAQUETE, PUBLIC Y DEFAULT
        //SON VISIBLES
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;

        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;

        //Clases del paquete 2
        //Lo default ahora es invisible
        ClaseE objE =  new ClaseE();
        //objE.publicE;

        //Clase F --> Default y no es visible
        //en otro paquete
        //ClaseF obj = new ClaseF();
    }
}
class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;

    public void prueba(){
        //TODAS LAS CLASES ESTAN EN PAQUETE1
        //MISMO PAQUETE, PUBLIC Y DEFAULT
        //SON VISIBLES
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;

        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;

        //Clases del paquete 2
        //Lo default ahora es invisible
        ClaseE objE =  new ClaseE();
        //objE.publicE;

        //Clase F --> Default y no es visible
        //en otro paquete
        //ClaseF obj = new ClaseF();
    }
}