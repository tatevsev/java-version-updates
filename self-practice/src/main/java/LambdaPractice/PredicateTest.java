package LambdaPractice;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<Integer> isOdd = a -> {
            if(a%2!=0){
              return   true;
            }else{
                return false;
            }
        };

        System.out.println("is Odd 4 = " + isOdd.test(4));


        Predicate <String> isPalindrome = a -> {
            String reverse = "";
            for (int i = a.length()-1 ; i>=0 ; i--){
                reverse+= a.charAt(i);
            }
            if(a.equals(reverse)){
                return true;
            }else {
                return false;
            }
        };

       boolean a =  isPalindrome.test("tata");
        System.out.println(a);
    }

}
