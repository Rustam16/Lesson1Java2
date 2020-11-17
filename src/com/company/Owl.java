package com.company;

import com.company.Bird;
import com.company.Color;

public class Owl extends Bird {

    public Owl(int age, double growth, Color color) {
        super(age, growth, color);

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
                + super.getColor()+".");
    }

}
