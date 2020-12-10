package com.company.tests;

import com.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Lab4ExampleTest {

    @Test
    void getTtoalVolume_NoTea_Equals_0() {
        Lab4Example l4 = new Lab4Example();
        l4.service = new ArrayList<>();
        l4.service.add(new Cup("Cup4", Material.FAIENCE,25));
        l4.service.add(new Cup("Cup5", Material.GOLD,25));


        assertEquals("Total available tea volume: 0",l4.getTtoalVolume());
    }
    @Test
    void getTtoalVolumeOfTea_Equals_Sum() {
        Lab4Example l4 = new Lab4Example();
        l4.service = new ArrayList<>();
        l4.service.add(new Cup("Cup4", Material.FAIENCE,25));
        l4.service.add(new TeaPot("pot5", Material.GOLD,25));


        assertEquals("Total available tea volume: 25",l4.getTtoalVolume());
    }

    @Test
    void getMaxVolume_EqualsBiggestVolume() {
        Lab4Example l4 = new Lab4Example();
        l4.service = new ArrayList<>();
        l4.service.add(new Cup("Cup4", Material.FAIENCE,25));
        l4.service.add(new Cup("Cup5", Material.GOLD,250));

        assertEquals("Max volume: 250",l4.getMaxVolume());
    }

    @Test
    void getAvgVolume_EqualsAvgVolume() {
        Lab4Example l4 = new Lab4Example();
        l4.service = new ArrayList<>();
        l4.service.add(new Cup("Cup4", Material.FAIENCE,20));
        l4.service.add(new Cup("Cup5", Material.GOLD,250));

        assertEquals("Average volume: 135.0",l4.getAvgVolume());
    }

    @Test
    void getDishesByMaterial() {
        Lab4Example l4 = new Lab4Example();
        l4.service = new ArrayList<>();
        l4.service.add(new Cup("Cup7",Material.GOLD,15));
        l4.service.add(new Cup("Cup4",Material.FAIENCE,25));
        l4.service.add(new Cup("Cup5",Material.FAIENCE,30));
        l4.service.add(new Cup("Cup6",Material.GOLD,35));


        assertEquals("{Not this=[Cup4, Cup5], zoloto=[Cup7, Cup6]}",l4.getDishesByMaterial(Material.GOLD).toString());
    }
}