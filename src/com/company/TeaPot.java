package com.company;

public class TeaPot extends Dishes{

    public TeaPot(String name, Material m, int volume) {
        super(name, m,volume);
    }

    public void MakeTea() throws BrokenException{
        if (this.isBroken)
            throw new BrokenException("The " + this.getName() + " is broken");
        if(isEmpty) {
            System.out.println("Making tea...");
            this.isEmpty = false;
        }
    }

    public void addTea(Cup cup) throws BrokenException {
        if (this.isBroken)
            throw new BrokenException("The " + this.getName() + " is broken");
        if (!this.isEmpty) {
            cup.isEmpty = false;
        }
    }

    @Override
    public String toString() {
        return this.getName() + "{" +
                "volume=" + this.measure +
                ", fullOfTea=" + !isEmpty +
                '}';
    }

}
