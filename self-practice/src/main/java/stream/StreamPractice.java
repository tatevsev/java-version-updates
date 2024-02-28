package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,90));

        System.out.println(numbers);

        //skip() function skips the first 5 elements of the List
        //distinct() function removes duplicates
        System.out.println("*************  SKIP AND DISTINCT  *********************");
       numbers =  numbers.stream().distinct().skip(5).collect(Collectors.toList());
       //first we make it stream then skip first 5 elements, made it back to Collection
        System.out.println(numbers);


        System.out.println("*************  LIMIT  *********************");

        //limit() function returns the first 5 elements

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,90));

        numbers1 = numbers1.stream().limit(5).collect(Collectors.toList());

        System.out.println(numbers1);

        System.out.println("***********  MAP  ******************");
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,90));
        //multiply odd elements by 3 and even elements by 10


     //  numbers2 = numbers2.stream().map(a -> a*10).collect(Collectors.toList()); //just multiply all elements by 10

        numbers2 = numbers2.stream().map(a -> {
            if(a%2==0) {
                return a*3;
            } else {
                return a*10;
            }
        }
        ).collect(Collectors.toList());

        System.out.println(numbers2);

        System.out.println("***********  FILTER  ******************");

        //filter() returns you boolean Predicate, if condition is matched returns new Stream instance
        //as long as method returns Stream instance multiple functions of Stream can be used at the same time
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(1,20,3,40,5,60,7,80,90,90));

        //return odd numbers only and mutiply them by 10
        numbers3 = numbers3.stream().filter(a -> a%2==0).map(a-> a*10).collect(Collectors.toList());

        System.out.println(numbers3);

        System.out.println("***********  SORTED  ******************");

        List<Integer> numbers4 = new ArrayList<>();
        numbers4.addAll(Arrays.asList(20,10,9,15,0,1,2,34,3));
        System.out.println(numbers4);
        //sort() sorting in ascending order

        numbers4 = numbers4.stream().sorted().collect(Collectors.toList());

        System.out.println(numbers4);

        System.out.println("***********  PEEK  ******************");

        //Peek() iterate each element
        //in task below we filtered only elements which are divisible by 5 and iterating them by using peek() function
        List<Integer> numbers5 = new ArrayList<>();
        numbers5.addAll(Arrays.asList(1,2,15,3,4,5,6,6,7,8,99,10));

       numbers5 = numbers5.stream().filter(a-> a%5==0).peek(a-> System.out.println(a)).collect(Collectors.toList());
        System.out.println(numbers5);



    }
}
