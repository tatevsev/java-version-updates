package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus (String status){

    }

    //in order to have OPEN and CLOSED existing without any value we would need to create another constructor without value
    ProjectStatus() {
    }
}
