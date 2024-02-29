package com.cydeo;

import com.cydeo.CalorieTask.Dish;
import com.cydeo.CalorieTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean b =  DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(b);

        System.out.println("ANY MATCH");
       // if(DishData.getAll().stream().anyMatch(dish -> dish.isVegetarian())){ same as below
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean b1 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(b1);

        System.out.println("FIND ANY");//returns any random qualifying element
        //Optional<Dish> dish1 = DishData.getAll().stream().filter(dish -> dish.isVegetarian()).findAny(); //same as below
        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish1.get());

        System.out.println("FIND FIRST");
       Optional<Dish> dish2 =  DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill");

        Optional<String> findFirst = list1.stream().parallel().filter(p-> p.startsWith("D")).findFirst();
        Optional <String> findAny = list1.parallelStream().filter(p-> p.startsWith("D")).findAny();

        //parallelStream() or stream().parallel() makes the Stream asynchronized
        System.out.println(findFirst);
        System.out.println(findAny);

        System.out.println("Min and Max");
        Optional<Integer> minCalorieDish = DishData.getAll().stream().map(p-> p.getCalories()).sorted().findFirst();
        System.out.println(minCalorieDish);
        //or we can use Min and Max methods

        Optional<Dish> dish =  DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        // Optional<Dish> dish =  DishData.getAll().stream().min(Comparator.comparing(p -> p.getCalories())); // same as above

        System.out.println(dish.get());

        //find max calorie dish
       Optional<Dish> max = DishData.getAll().stream().sorted(Comparator.comparing(Dish::getCalories).reversed()).findFirst();
        System.out.println(max.get());

        //or we can use max() method
        Optional<Dish> maxCalories =  DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        //DishData.getAll().stream().max(Comparator.comparing(dish3 -> dish3.getCalories())); // same as above
        System.out.println(maxCalories.get());


    }
}