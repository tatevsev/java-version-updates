package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(1,2,3,4);
      // list.forEach(p -> System.out.println(p)); same as below
       list.forEach(System.out::println);

        System.out.println("-----------------------------------");

        System.out.println("         Filter           "); //filters elements according to the condition
        //print even numbers
        list.stream().
                filter(i-> i%2 == 0)
                .forEach(System.out::println);

        System.out.println("        Distinct           "); //eliminates duplicates
        Stream<Integer> str = list.stream().filter(i-> i%2==0).distinct();

      //  str.forEach(p-> System.out.println(p)); same as below
        str.forEach(System.out::println);

        System.out.println("          Limit              "); //shows specified number

        list.stream().filter(i -> i%2==0).limit(1).forEach(System.out::println);


    }
}
