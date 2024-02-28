package LambdaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        //Create a function to merge 2 arrays and return it as a list

        BiFunction<int [],int [], List<Integer>> mergeTwoArrays = (a , b )  ->{
            List<Integer> list = new ArrayList<>();
            for(Integer each : a){
                list.add(each);
            }
            for(Integer each : b){
                list.add(each);
            }
            return list;
            } ;


        int [] arr1 =  {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,20};

        System.out.println(mergeTwoArrays.apply(arr1, arr2));

    }

    }

