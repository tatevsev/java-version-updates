package com.cydeo;

public class main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");
        Currency[] currencies =  Currency.values();//we don't use new keyword in ENUM

        for(Currency currency : currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with Enums");

        Currency myCurrency = Currency.QUARTER;

        switch (myCurrency){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cents");
                break;
            case DIME:
                System.out.println("It is 10 cents");
                break;
            case QUARTER:
                System.out.println("It is 25 cents");
                break;
        }

        System.out.println("------------------Operation task---------------------");
        calculate(3,5,Operation.PLUS);



    }

    private static void calculate(double x,double y,Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
    }
}
