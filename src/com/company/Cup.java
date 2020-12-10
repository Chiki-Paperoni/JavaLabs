package com.company;

public class Cup extends Dishes{
    protected boolean withSugar;

    Cup(String name, Material m,int volume) {
        super(name, m,volume);
        this.withSugar =false;
    }

    @Override
    public String toString() {
        return this.getName() + "{" +
                "withSugar=" + withSugar +
                ", fullOfTea=" + !isEmpty +
                '}';
    }
}
