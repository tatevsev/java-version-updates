package com.cydeo;



import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails

        System.out.println("Print all Emails");
        EmployeeData.readAll()
                //.map(email-> email.getEmEmail()) same as below
                .map(Employee::getEmEmail)
                .forEach(System.out::println); // or .forEach(p-> System.out.println(p))

        System.out.println("Print all Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmPhoneNumbers().stream())
                        //.parallelStream())
                .forEach(System.out::println);

        System.out.println("Print all Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);





    }
}
