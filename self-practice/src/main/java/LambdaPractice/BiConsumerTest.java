package LambdaPractice;

import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        //create a function that can print the String for specified times in different lines

        BiConsumer<String,Integer> printMultipleTimes = (a,b) -> {
            for(int i= 0; i < b ; i ++){
                System.out.println(a);
            }
        };

        String name = "Tata";
        Integer count = 5;
        printMultipleTimes.accept(name,count);

    }
}
