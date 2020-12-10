package com.company.tests;

import com.company.BrokenException;
import com.company.Cup;
import com.company.Material;
import com.company.TeaPot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaPotTest {

    @Test
    void makeTea_PotEmpty_false() {
        TeaPot t = new TeaPot("Pot", Material.GOLD,10);
        try {
            t.MakeTea();
        } catch (BrokenException e) {
            e.printStackTrace();
        }

        assertFalse(t.isEmpty);
    }

    @Test
    void addTea_CupEmpty_False() {
        TeaPot t = new TeaPot("Pot", Material.GOLD,10);
        Cup c = new Cup("Cup",Material.GOLD,200);

        try {
            t.MakeTea();
            t.addTea(c);
        } catch (BrokenException e) {
            e.printStackTrace();
        }

        assertFalse(c.isEmpty);
    }

    @Test
    void testToString() {
        TeaPot t = new TeaPot("Pot",Material.GOLD,20);

        assertEquals("Pot{volume=20, fullOfTea=false}",t.toString());
    }
}