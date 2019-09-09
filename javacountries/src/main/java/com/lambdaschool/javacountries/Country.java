package com.lambdaschool.javacountries;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
    // Fields
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private int population;
    private int landMass;
    private int medianAge;
//Constructor


    public Country(String name, int population, int landMass, int medianAge) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.landMass = landMass;
        this.medianAge = medianAge;
    }
    // making a clone of the object
    public Country(Country toClone)
    {
        this.id = toClone.getId();
        this.name= toClone.getName();
        this.population = toClone.getPopulation();
        this.landMass= toClone.getLandMass();
        this.medianAge = toClone.getMedianAge();



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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
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
