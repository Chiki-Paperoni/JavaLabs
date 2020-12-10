package com.company.tests;

import com.company.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void CustomerAddTea_CupEmpty_False() throws BrokenException {
        Customer c = new Customer();
        Cup cup = new Cup("Cup", Material.GOLD,10);
        TeaPot pot = new TeaPot("Pot",Material.GOLD,100);

        pot.MakeTea();
        c.addTea(cup,pot);

        assertFalse(cup.isEmpty);
    }

    @Test
    void CustomerAddSugar_CupSugar_True() {
        Customer c = new Customer();
        Cup cup = new Cup("Cup", Material.GOLD,10);
        SugarBowl bowl = new SugarBowl("bowl",Material.GOLD,100);

        c.addSugar(cup,bowl);

        assertTrue(cup.withSugar);
    }

    @Test
    void CustomerMakeTea_PotEmpty_False() throws BrokenException {
        TeaPot pot = new TeaPot("Pot",Material.GOLD,100);

        pot.MakeTea();

        assertFalse(pot.isEmpty);
    }
}