package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab4Example {

    public ArrayList<Dishes> service;


    public String getTtoalVolume() {
        return "Total available tea volume: " + service.stream()
                .filter(dish -> dish instanceof TeaPot)
                .mapToInt(dish -> ((TeaPot) dish).getVolume()).sum();
    }
    public String getMaxVolume() {
        return "Max volume: " +  service.stream()
                .mapToInt(Dishes::getVolume)
                .max().getAsInt();
    }
    public String getAvgVolume() {
        return"Average volume: " +  service.stream()
                .mapToInt(d -> d.getVolume())
                .average().getAsDouble();
    }

    public Map<String, List<String>> getDishesByMaterial(Material m) {
//        return service.stream()
//                .collect(Collectors.groupingBy(dish -> dish.getMaterial().equals(m)?
//                        m.toString() : "Not this"));
                return service.stream()
                        .collect(Collectors.groupingBy(dish -> dish.getMaterial().equals(m)?
                                        m.toString() : "Not this",
                                Collectors.mapping(Dishes::getName, Collectors.toList())));

    }







}
