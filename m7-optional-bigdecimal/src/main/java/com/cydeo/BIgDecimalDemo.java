package com.cydeo;

import java.math.BigDecimal;

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



    }
}
