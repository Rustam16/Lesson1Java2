package com.company;

public class Bird {
    private int age;
    private double growth;
    private Color color;
    private Continent continent;

    public Bird(int age, double growth, Color color, Continent continent) {
        this.age = age;
        this.growth = growth;
        this.color = color;
        this.continent = continent;
    }


    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }

    public Color getColor() {
        return color;
    }

    public Continent getContinent() {
        return continent;
    }
}
