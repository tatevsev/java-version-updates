package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(2, 4, 6, 8);
        List<Integer> umodifiableList =  List.copyOf(numberList); //create immutable list from current list
        List<Integer> unmodifiableList2 = List.of(1,2,3,4); //creates immutable list from elements




    }
}