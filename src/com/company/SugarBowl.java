package com.company;

public class SugarBowl extends Dishes{



    public SugarBowl(String name, Material m, int volume) {
        super(name, m,volume);
        this.isEmpty = false;

    }

    public void addSugar(Cup cup) throws BrokenException{
        if (this.isBroken)
            throw new BrokenException("The " + this.getName() + " is broken");
        if (!this.isEmpty) {
            cup.withSugar = true;
        }
    }
    @Override
    public String toString() {
        return this.getName() + "{" +
                "volume=" + this.measure +
                ", fullOfSugar=" + !isEmpty +
                '}';
    }
}
