package org.example;

public class Auto extends Vehicle{
    //Attribute
    public Auto(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                "} " + super.toString();
    }

    @Override
    public int accelerate(int kmh) {
        System.out.println("Geschwindigkeit wird erhöht: ");
        return this.velocity+=kmh;
    }

    @Override
    public int bremsen(int kmh) {
        System.out.println("Geschwindigkeit wird verringert: ");
        return this.velocity-=kmh;
    }


}
