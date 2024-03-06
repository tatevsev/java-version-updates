package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str = "Mike \n Ozzy \n Emmy";
        str.lines().forEach(System.out::println); //takes each line and converts to stream

        String n = "Java";
        System.out.println(n.repeat(3)); //accepts int count ans returns String whose value is the concatination of given String repeated count time
        n.lines().forEach(p-> System.out.println(p)); //lines() gets all the lines in a String as a Stream


    }
}
