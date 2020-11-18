package com.company;

public class Continent {
    private String continentName;
    private String continentTerrain;

    public Continent(String continentName, String continentTerrain) {
        this.continentName = continentName;
        this.continentTerrain = continentTerrain;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getContinentTerrain() {
        return continentTerrain;
    }
}
