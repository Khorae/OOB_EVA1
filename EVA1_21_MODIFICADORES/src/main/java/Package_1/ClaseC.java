package Package_1;

import Package_2.ClaseE;

public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;

    public void prueba(){
        //CLASE DEL MISMO PAQUETE
        ClaseB objb = new ClaseB();
        //objb.defaultB;
        //objb.publicB;

        //CLASE DEL PAQUETE2
        ClaseE obje= new ClaseE();
        //obje.publicE;

        //CLASE F ESTA EN OTRO PAQUETE
        //Y ES DEAFULT , ES INVISIBLE
        //ClaseF objf new ClaseF();
    }
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}