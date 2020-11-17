package com.company;

public class Main {

    public static void main(String[] args) {

        Owl owl = new Owl(5,1.2,Color.BLACK);
        System.out.println("\n" +owl.printInfo()+"\n");

        Barnowl barnowl1 = new Barnowl(11,0.45,Color.BLUE);
        barnowl1.makeVoice("ku kuuu",2);
        barnowl1.makeVoice("kukukku kuuu");
        System.out.println(barnowl1.printInfo()+"\n");

        Barnowl barnowl2 = new Barnowl(7,0.47,Color.GREEN);
        barnowl2.makeVoice("zzzku",1);
        barnowl2.makeVoice("kuuuuuuuuuu");
        System.out.println(barnowl2.printInfo());
    }


}
