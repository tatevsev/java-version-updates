package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BIgDecimalDemo {
    public static void main(String[] args) {

       double amount1 = 374.56;
       double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56"); //the way to create a Decimal object
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56); //another way to create a Decimal object
        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(b2));

        BigDecimal b = BigDecimal.TEN;
        System.out.println(b.multiply(BigDecimal.ZERO));
        System.out.println(b);
        System.out.println(b1.multiply(new BigDecimal("15.00")));

        //Scaling
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING)); //23.2
        System.out.println(number1.setScale(2,RoundingMode.CEILING)); //23.12
        System.out.println(number1.setScale(3, RoundingMode.CEILING)); //23.12000
        System.out.println(number1.setScale(4, RoundingMode.CEILING)); //23.12000
        System.out.println(number1.setScale(5, RoundingMode.CEILING)); //23.12000
        System.out.println(number1.setScale(3,RoundingMode.FLOOR)); //23.120


        //Do not use equals() anymore.Use compareTo()
         System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
         System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
         System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));
         System.out.println(new BigDecimal("2").compareTo(new BigDecimal("4")));
         System.out.println(new BigDecimal("2").compareTo(new BigDecimal("6")));












    }
}
