package com.cydeo;

import com.cydeo.CalorieTask.Dish;
import com.cydeo.CalorieTask.DishData;

import java.io.DataInput;
import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {

        //find the sum if number's digits
        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum= 0;
        for(Integer number: numbers){
            sum+=number;
        }

        System.out.println(sum);
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        //find the total calories of the dishes of DishData class

      int calories =  DishData.getAll().stream().map(dish -> dish.getCalories()).reduce(0, (a,b)->a+b);

      //second approach is also acceptable, but it will return Optional<Integer> operator therefore we use get()
      int calories1 = DishData.getAll().stream().map(Dish::getCalories).reduce((a,b)->a+b).get();

        System.out.println(calories);
    }
}
