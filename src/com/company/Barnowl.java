package com.company;

public class
Barnowl extends Owl {
    public Barnowl(int age, double growth, Color color,Continent continent, String owlGender ) {
        super(age, growth, color ,continent, owlGender);

    }
    public void  makeVoice(String voice,int num){
            System.out.println("kuukuuu");
        }
    public final String printInfo() {
        return super.printInfo() ;
    }

}
