package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("WITHOUT PREDICATE");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0900000000"));
        System.out.println(isPhoneNumberValid("09009877300"));


        System.out.println("WITH PREDICATE");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println("MIXING 2 PREDICATE FUNCTIONS");

        //Predicate 1 OR Predicate 2 is true
        System.out.println(
                "is Phone Number Valid and contains Number 3 = " + isPhoneNumberValidPredicate.or(containsNumber3).test("07000000003"));
        //Predicate 1 AND Predicate 2 is true
        System.out.println(
                "is Phone Number Valid and contains Number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));

        System.out.println(
                "is Phone Number Valid and contains Number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("0900000000"));

    }


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() ==11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
