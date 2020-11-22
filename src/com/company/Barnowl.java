package com.company;

public final class Barnowl extends  Owl {
    private String copy;


    public Barnowl(int age, double growth, Color color,Continent continent, String owlGender ) {
        super(age, growth, color ,continent, owlGender);
        this.copy = "";

    }
    public void  makeVoice(String voice,int num){
            System.out.println("kuukuuu");
        }
    public final String printInfo() {
        return super.printInfo() ;
    }

    public void copy(Bird bird){
        if (bird.getColor() == this.getColor())
            copy = " New : " + this.getAge() + " "+Color.BLACK +" "+ getContinent() + " "+getOwlGender() +" ";
        else
            System.out.println(" No copy ");
    }
}
