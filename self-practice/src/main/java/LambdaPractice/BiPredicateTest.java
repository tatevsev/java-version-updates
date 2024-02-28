package LambdaPractice;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {

        //create contains function for int [], to check if an int contains in any of the elements of int []

        BiPredicate<int [], Integer> contains = (a , b)  -> {
            for (int each : a) {
                if(each==b){
                    return true;
                }
            }
            return false;
        };

        int [] nums= {100,200,300,400};
        int num = 100;
        System.out.println(contains.test(nums, num));


    }
}
