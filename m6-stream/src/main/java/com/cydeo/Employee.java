package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String emName;
    private String emEmail;
    private List<String> emPhoneNumbers;

}
