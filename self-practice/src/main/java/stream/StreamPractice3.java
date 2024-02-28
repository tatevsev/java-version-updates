package stream;

import java.util.Arrays;

public class StreamPractice3 {
    public static void main(String[] args) {

      //allMatch(Predicate) : checks if all elements in the stream matches with the specified predicate
        int[] nums1 ={1,2,3,4,5,6,7,8,9,11};

        boolean r1= Arrays.stream(nums1).allMatch(p-> p<10); //checks if all elements <10

        System.out.println(r1);

      //anyMatch(Predicate) : checks if any element in the stream matches with the specified predicate
        int[] nums2 = {1,2,3,4,5,6,7,8,9};

        boolean r2 = Arrays.stream(nums2).anyMatch(p-> p%2==0);//checks if at least one element is even

        System.out.println(r2);


        //noneMatch(Predicate) : checks if any of the elements in the stream matches with the specified predicate
         int[] nums3 = {1,2,3,4,5,6,7,8,9};

         boolean r3 = Arrays.stream(nums3).noneMatch(p-> p==10);//checks if none is matching 10
        System.out.println(r3);


    }
}
