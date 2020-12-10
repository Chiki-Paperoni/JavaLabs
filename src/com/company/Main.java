package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
//test changes
    public static void main(String[] args) {

        ArrayList<Dishes> service = new ArrayList<>();
        TeaPot pot = new TeaPot("TeaPot0",Material.GOLD,50);
        SugarBowl bowl = new SugarBowl("SugarBowl0",Material.SILVER,50);
        Customer c = new Customer();
        //bowl.breakDown();
        for (int i = 0;i < 3;i++) {
            service.add(new Cup("Cup" + i,Material.GOLD,10));
            c.addSugar((Cup) service.get(i),bowl);
            c.MakeTea(pot);
            c.addTea((Cup) service.get(i),pot);

        }
        for (int i = 0;i < 3;i++) {
            service.add(new Plate("Plate" + i,Material.GOLD,10));
        }
        service.add(pot);
        service.add(bowl);

        StringBuffer names = new StringBuffer();
        Iterator<Dishes> iter = service.iterator();
        while (iter.hasNext()) {
            //names.append(iter.next().getName()).append(" ");
            System.out.println(iter.next());
        }
        //System.out.println(names);

    }
}
