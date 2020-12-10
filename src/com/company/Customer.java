package com.company;

public class Customer {

    public void addTea(Cup c,TeaPot p) {
        try {
            p.addTea(c);
        } catch (BrokenException e) {
            System.out.println(e.getMessage());
        }
    }
    public void addSugar(Cup c,SugarBowl s) {
        try {
            s.addSugar(c);
        } catch (BrokenException e) {
            System.out.println(e.getMessage());
        }
    }
    public void MakeTea(TeaPot p) {
        try {
            p.MakeTea();
        } catch (BrokenException e) {
            System.out.println(e.getMessage());
        }
    }
}
