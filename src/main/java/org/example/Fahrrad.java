package org.example;

public class Fahrrad extends Vehicle{

    public int maxGeschwindigkeit = 35;
    public Fahrrad(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        this.velocity+=kmh;
        if(this.velocity > maxGeschwindigkeit){
            System.out.println("Endgeschwindigkeit zu hoch");
            //throw new RuntimeException("Geschwindigkeit darf 35 kmh nicht überschreiten");
            return this.velocity-=kmh;
        }
        System.out.println("Neue Geschwindigkeit: " + this.velocity);
        return this.velocity;
        }

    @Override
    public String toString() {
        return "Fahrrad{" +
                "maxGeschwindigkeit=" + maxGeschwindigkeit +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                "} " + super.toString();
    }

    @Override
    public int bremsen(int kmh) {
        return 0;
    }
}
