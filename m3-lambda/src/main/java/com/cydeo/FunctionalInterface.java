package com.cydeo;

import com.cydeo.Apple.Apple;
import com.cydeo.Apple.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap =new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };

        System.out.println("******************PREDICATE*****************");

        Predicate<Integer> lesserThan = i -> i <18; //returns boolean
        System.out.println(lesserThan.test(20));


        System.out.println("******************CONSUMER*****************");

        Consumer <Integer> display = i -> System.out.println(i); //doesn't return any value
        display.accept(10);

        System.out.println("******************BI CONSUMER*****************");
        BiConsumer<Integer,Integer> addTwo = ( x,y) -> System.out.println(x+y); //if its 2 parameters () are necessary
        addTwo.accept(1,2);


        System.out.println("******************FUNCTION*****************");
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));


        System.out.println("******************BI FUNCTION*****************");
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("******************SUPLIER*****************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }
}
