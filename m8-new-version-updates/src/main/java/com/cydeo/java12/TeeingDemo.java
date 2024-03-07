package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class TeeingDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"B",200),
                new Employee(3,"D",300)
        );



       HashMap<String,Employee> result =  employeeList.stream().collect(Collectors.teeing( //merging 2 streams
                Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary())),
                Collectors.minBy(Comparator.comparing(employee -> employee.getSalary())),
                (e1,e2) ->{ //e1 and e2 returns Optional datatype of MAX and MIN values
                    HashMap<String, Employee> map = new HashMap<>();
                    map.put("MAX",e1.get());
                    map.put("MIN",e2.get());
                    return map;
                }

        ));

        System.out.println(result); //{MIN=Employee{id=1, name='A', salary=100}, MAX=Employee{id=3, name='D', salary=300}}



    }
}
