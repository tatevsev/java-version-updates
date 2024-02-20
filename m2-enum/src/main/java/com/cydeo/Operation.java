package com.cydeo;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is an object of Operation

    Operation() { //constructor cannot be public
        System.out.println("Constructor");
    }
}
