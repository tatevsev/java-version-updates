package stream;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args) {

        System.out.println("=========   STRING methods   ======");
        //leave only elements that starts with "J"
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Java","Python","Job","Apple","Wooden Spoon","JavaScript",
                "Jeep", "Sumsung","Book","Computer","Camera"
        ));

       words= words.stream().filter(a-> a.startsWith("J")).collect(Collectors.toList());
        System.out.println(words);

        System.out.println("=========  ToArray   ======");

        //Given int []  print only even numbers
        int [] numbers ={10,15,20,25,30,35,40,45,50};
        numbers = Arrays.stream(numbers).filter(p-> p%2==0).toArray();

        System.out.println(Arrays.toString(numbers));

        System.out.println("=======    COUNT()     ==============");

        //count() counting total number of elements

       long n = Stream.of(1,2,3,4,5,6,7,8,9).count();

        System.out.println(n);

        //count how many Java are in the array
        String [] word = {"Java","Python","C#","C++","Ruby","Java"};

       long bi = Arrays.stream(word).filter(p-> p.equals("Java")).count();
        System.out.println(bi);

        System.out.println("=======   REDUCE()   ==============");

        //reduce(initialIdentity, BinaryOperator) : combines the elements of stream and returns them as a single value

        int [] arr = {1,2,3,4,5};

        //count the sum of all elements
       int sum = Arrays.stream(arr).reduce(0,(a,b) -> a+b );

        System.out.println(sum);


        System.out.println("-------------------------------------------");

        //Concatenate all the elements of String [] languages
        String [] language = {"Java","Python","C#","C++","Ruby","Java"};

        String o = Arrays.stream(language).reduce("",(x,y) -> x + y);
        System.out.println(o);

        System.out.println("=======   ForEach()   ==============");


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //First filter if element is > 5 then iterate the list

        list.stream().filter(p-> p>5 ) .forEach(p-> System.out.println(p));







    }

}
