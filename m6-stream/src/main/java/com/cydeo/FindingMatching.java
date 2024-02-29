package com.cydeo;

import com.cydeo.CalorieTask.Dish;
import com.cydeo.CalorieTask.DishData;

import java.util.Optional;

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

        System.out.println("FIND ANY");
        //Optional<Dish> dish1 = DishData.getAll().stream().filter(dish -> dish.isVegetarian()).findAny(); //same as below
        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish1.get());
    }
}