package com.company;

public class Bird {
    private int age ;
    private double growth;
    private Color color;

    public Bird(int age,double growth, Color color){
        this.age= age;
        this.growth = growth;
        this.color = color;
    }


    public int getAge(){return age;}

    public double getGrowth() {
        return growth;
    }

    public Color getColor() {
        return color;
    }

}
