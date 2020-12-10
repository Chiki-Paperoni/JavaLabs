package com.company.tests;

import com.company.BrokenException;
import com.company.SugarBowl;
import org.junit.jupiter.api.Test;
import com.company.Cup;
import com.company.Material;

import static org.junit.jupiter.api.Assertions.*;

class SugarBowlTest {

    @Test
    void addSugar_CupSugar_true() {
        Cup c = new Cup("Cup",Material.SILVER,10);
        SugarBowl s = new SugarBowl("SBowl",Material.GOLD,12);

        try {
            s.addSugar(c);
        } catch (BrokenException e) {
            e.printStackTrace();
        }

        assertTrue(c.withSugar);
    }

    @Test
    void testToString() {
        SugarBowl s = new SugarBowl("Bowl0", Material.SILVER,10);


        assertEquals("Bowl0{volume=10, fullOfSugar=true}",s.toString());
    }
}