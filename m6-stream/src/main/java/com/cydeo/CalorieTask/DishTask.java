package com.cydeo.CalorieTask;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish-> dish.getCalories()<400)
                .map(dish -> dish.getName())
             //   .map(Dish::getName) same code as above .map(dish -> dish.getName())
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");
        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(dish-> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");
        //Print first 3 dishes that have highest calories >300
        DishData.getAll().stream()
                .filter(dish-> dish.getCalories() >300)
                .map(dish -> dish.getName())
                .limit(3)
                .forEach(System.out::println);


        System.out.println("----------------------------------------------------------------");
        //Print names of all dishes that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish-> dish.getCalories()<400)
              //  .sorted(Comparator.comparing(dish -> dish.getCalories())).map(dish -> dish.getName()) same as beloe
              //  .forEach(p-> System.out.println(p)); same as below
                .sorted(Comparator.comparing(Dish::getCalories)).
                // if we need to sort in reverse order=> .sorted(Comparator.comparing(Dish::getCalories)).reverse()
                map(Dish::getName)
                .forEach(System.out::println);


        //How would you count the number of dishes in a stream using the map
        //and reduce methods?

      long numberOfDishes =   DishData.getAll().stream().count();
        System.out.println(numberOfDishes);



    }
}
