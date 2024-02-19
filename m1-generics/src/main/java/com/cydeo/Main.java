package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>(); //items accepts only Integer

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      //  items.add("Apple");


        printDoubled(items);


        System.out.println("********************************************");
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team liverpool= new Team("Liverpool"); //in this case team accepting any object
        liverpool.addPlayer(joe);
        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);







    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer each : items) {
            System.out.println(each*2);
        }



    }


}
