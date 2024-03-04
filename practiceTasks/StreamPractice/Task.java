package practiceTasks.StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        //1. Given a list of numbers how would you return a list of the square of each
        //number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

      List<Integer> squareList =  list.stream().map(number -> number * number).collect(Collectors.toList());

        System.out.println(squareList);

        // task 2

        List<Integer> number1 = Arrays.asList(1,2,3);
        List<Integer> number2 = Arrays.asList(3,4);


        List<int[]> pairsOfNumbers = number1.stream()
                .flatMap(num1 -> number2.stream().map(num2 -> new int[]{num1, num2}))
                .collect(Collectors.toList());

        pairsOfNumbers.forEach(eachPair->System.out.println(Arrays.toString(eachPair)));


    }

    }

/*
1. Given a list of numbers how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
2. Given two lists of numbers, how would you return all pairs of numbers? For
example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
(2,4),(3,3),(3,4)]
• List<Integer> numbers1 = Arrays.asList(1,2,3);
• List<Integer> numbers2 = Arrays.asList(3,4);
• List<int[]> pairs = ?????
 */