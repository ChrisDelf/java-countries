package com.lambdaschool.javacountries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    // Fields
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private int populations;
    private int landMass;
    private int medianAge;
//Constructor


    public Country(long id, String name, int populations, int landMass, int medianAge) {
        this.id = id;
        this.name = name;
        this.populations = populations;
        this.landMass = landMass;
        this.medianAge = medianAge;
    }
    // getters and setters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulations() {
        return populations;
    }

    public void setPopulations(int populations) {
        this.populations = populations;
    }

    public int getLandMass() {
        return landMass;
    }

    public void setLandMass(int landMass) {
        this.landMass = landMass;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }
}
