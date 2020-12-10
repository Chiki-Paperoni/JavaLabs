package com.company;

public abstract class Dishes implements Brekable {
    private String name;
    private Material material;
    protected int measure;
    public boolean isBroken;
    public boolean isEmpty;

    public String getName() {
        return this.name;
    }
    public String getMaterial(){
        return this.material.toString();
    }
    public int getVolume() {
        return this.measure;
    }

    Dishes(String name,Material m,int measure) {
        this.name = name;
        this.material = m;
        this.isBroken = false;
        this.isEmpty = true;
        this.measure = measure;
    }
    Dishes(){}
    @Override
    public boolean breakDown() {
        return this.isBroken = true;
    }

}
