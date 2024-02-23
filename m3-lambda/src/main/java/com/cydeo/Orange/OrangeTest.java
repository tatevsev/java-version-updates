package com.cydeo.Orange;
import com.cydeo.Apple.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));


        OrangeFormatter colorLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory,colorLambda);

        //faster way if we want to pass the action directly to the method
        // prettyPrintOrange(inventory,orange -> "An orange of " + orange.getWeight() + "g");
    }



    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){
        for (Orange each : inventory) {
            String output  = formatter.accept(each);
            System.out.println(output);
        }
    }

}

/*
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
for(Apple apple : inventory){
String output = ???.???(apple);
System.out.println(output);
}
}

Sample Output :
A Light GREEN apple
A Heavy RED apple
A Light GREEN apple

Sample Output :
An apple of 80g
An apple of 155g
An apple of 120g
 */