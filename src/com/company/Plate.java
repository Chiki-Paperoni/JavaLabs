package com.company;

public class Plate extends Dishes{

    Plate(String name, Material material,int diam) {
        super(name, material,diam);
    }

    public int getDiam() {
        return this.measure;
    }

    @Override
    public String toString() {
        return this.getName() + "{" +
                "diameter=" + this.measure +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
