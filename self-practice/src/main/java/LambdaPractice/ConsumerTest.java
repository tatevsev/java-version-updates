package LambdaPractice;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        //Create a function that takes an Array of Integers and prints every element of Array

        Consumer<int[]> printEach = arr -> {
            for (int each: arr) {
                System.out.println(each);
            }
        };

        int [] b = {1,2,3,5};
        printEach.accept(b);


    }
}
