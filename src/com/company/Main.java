package com.company;

public class Main {

    public static void main(String[] args) {

        Continent continent = new Continent("America", "Сан Франциско");
        Continent continent1 = new Continent("Южная Америка", "Сантияго");
        Continent continent3 = new Continent("Африка", "Каир");
        Owl owl = new Owl(12, 1.3, Color.BLACK,  continent,"female");
        owl.makeVoice("kuu -"+ " kuuku",5);
        System.out.println(owl.printInfo());


        Barnowl barnowl = new Barnowl(6,2.1,Color.BLUE,continent1,"female");
        barnowl.makeVoice("kuu");
        System.out.println(barnowl.printInfo());

        Barnowl barnowl1 = new Barnowl(3,0.45,Color.GREEN,continent3,"male");
        barnowl1.makeVoice("zkuuu",2);
        System.out.println(barnowl1.printInfo());


        barnowl1.copy(barnowl1);
        System.out.println(barnowl.printInfo());

    }

}
