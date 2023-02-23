package org.example;

public class Tv {
    //atributos: estado
    private boolean power;
    private int volume;
    private int channel;
    //metodos: comportamiento
    //constructor
    public Tv(){ //constructor default
        power = false; //apagado
        volume = 0;
        channel =5;
    }

    public void cambiarPower() {
        if (power == false) { //apagado
            power = true;
            System.out.println("TELEVISION ENCENDIDA");
        }else {
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }
    public void upVolume(){
        if (power == true) {
            if(volume < 100) {
                volume = volume + 5;
                System.out.println("Volumen: " + volume);
            }
        }
    }
    public void downVolume(){
        if (power == true) {
            if (volume > 0) {
                volume = volume - 5;
                System.out.println("Volumen: " + volume);
            }
        }
    }
    public void upChannel(){
        if (power == true) {
            if(channel < 100) {
                channel = channel + 1;
            }else {
                channel = 0;
                }
            System.out.println("Canal: " + channel);
            }
        }
    public void downChannel(){
        if (power == true) {
            if(channel > 0) {
                channel = channel - 1;
            }else {
                channel = 100;
            }
            System.out.println("Canal: " + channel);
        }
    }
    }


