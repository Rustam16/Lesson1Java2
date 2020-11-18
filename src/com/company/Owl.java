package com.company;

import com.company.Bird;
import com.company.Color;

public class Owl extends Bird {

    private String owlGender;


    public Owl(int age, double growth, Color color,Continent continent, String owlGender) {
        super(age, growth, color,continent);
        this.owlGender = owlGender;

    }
    public String getOwlGender() {
        return owlGender;
    }

    public void  makeVoice(String voice , int num){
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

   public final void makeVoice(String voice){
        System.out.println(voice);
    }

    public String printInfo() {
        return "age = "+ (super.getAge()+ ", Growth = " + super.getGrowth() + ", color = "
                + super.getColor()+", Continent = "+getContinent().getContinentName()+
                ", continent Terrain ="+getContinent().getContinentTerrain() + ", Gender = "+ getOwlGender());
    }


}
