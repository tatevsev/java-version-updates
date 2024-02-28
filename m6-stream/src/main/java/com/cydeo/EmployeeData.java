package com.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2022028765","79899888")),
                new Employee(100,"Ozzy","ozzy@cydeo.com", Arrays.asList("4122028765","899899888")),
                new Employee(100,"Peter","peter@cydeo.com", Arrays.asList("51622028765","61999888"))
        );
    }
}
