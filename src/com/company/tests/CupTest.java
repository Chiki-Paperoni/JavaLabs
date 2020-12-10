package com.company.tests;

import com.company.Cup;
import com.company.Material;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void testToString() {
        Cup c = new Cup("Cup0", Material.SILVER,10);


        assertEquals("Cup0{withSugar=false, fullOfTea=false}",c.toString());
    }
}