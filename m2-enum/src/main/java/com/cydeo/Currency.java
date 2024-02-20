package com.cydeo;

public enum Currency {
    PENNY(1),DIME(10),QUARTER(25),NICKLE(5);

   private int value;

    Currency(int value) {
        this.value = value;
    }

    //PENNY,DIME,QUARTER,NICKLE are constant objects of Currency class


    public int getValue() {
        return value;
    }
}
