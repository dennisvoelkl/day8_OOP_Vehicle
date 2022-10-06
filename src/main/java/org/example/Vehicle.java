package org.example;

public abstract class Vehicle implements Accelerateable{
    //Attribute
    protected int id;
    protected String name;
    protected int velocity;

    public Vehicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

}
