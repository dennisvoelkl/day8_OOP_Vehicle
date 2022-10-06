package org.example;

public class Main {
    public static void main(String[] args) {
        //Auto erstellt
        Vehicle auto = new Auto(1, "Audi", 50);
        Vehicle fahrrad = new Fahrrad(1, "Cube", 0);
        //System.out.println("Unser Auto: " + auto);
        System.out.println("Unser Fahrrad: " + fahrrad);
        // Fahre mit Auto
        // Gebe Gas mit 10
        //float speed = auto.accelerate(10);
        //int speedFahrrad = 0;
        //System.out.println(speed);
        //speed += auto.accelerate(20);
        //System.out.println(speed);

        //speed = auto.bremsen(10);
        //System.out.println(speed);

        fahrrad.accelerate(30);
        fahrrad.accelerate(1);
        fahrrad.accelerate(2);
        fahrrad.accelerate(4);
        fahrrad.accelerate(3);
        fahrrad.accelerate(2);
        fahrrad.accelerate(1);



    }
}