package com.cydeo;

import com.cydeo.CalorieTask.Dish;
import com.cydeo.CalorieTask.DishData;
import com.cydeo.CalorieTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

       //toCollection(Supplier) : is used to create Collection using Collector

        //print elements that are even
       List<Integer> numberList =  numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toCollection(ArrayList::new)); //inside collect() we nees to put a new List to store our data

        System.out.println(numberList);

      Set<Integer> numberSet =  numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        // toSet() : returns a Collector interface that gathers the input data into a new Set
        Set<Integer> n = numbers.stream().filter(p->p%2==0).collect(Collectors.toSet());
        System.out.println(n);

        //toList(): returns a Collector interface that gathers the input data into a new list
        System.out.println("LIST");

       List<Integer> numberList2 =  numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.toList());
        //toMap(Function,Function): returns a Collector interface that gathers the input date into a new map

        Map<String,Integer> dishMap =  DishData.getAll()
                .stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFUnction) : returns a Collector that produces the sum of an Integer-valued func

       Integer sum =  DishData.getAll()
                .stream()
                        .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //below is another way of calculating
        DishData.getAll()
                .stream().mapToInt(Dish::getCalories).sum();

        //counting(): returns a Collector that counts the number of the elements

       long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //averagingInt(ToIntFunction) : returns the average of the integers passed values

        Double averageCalories = DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(averageCalories);

        //joining() : is used to join(merge) various elements of a character or String array into a single Object

        List<String > courses = Arrays.asList("Java","JS","TS");

        String course = courses.stream().collect(Collectors.joining("/"));
        System.out.println(course);

        //partitioningBy(): is used to partition a stream of Objects (or a set of elements ) based on a given Predicate)

        Map <Boolean,List<Dish>> isVegetarianDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(isVegetarianDish);

        //groupingBy(): is used for grouping Objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishTypes = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishTypes);



    }
}
