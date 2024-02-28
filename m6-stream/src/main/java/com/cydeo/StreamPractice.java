package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {

      //Given a list of words, print the number of characters for each word

        List<String> words = Arrays.asList("Java","Apple","Honda", "Developer");

        words.stream().map(p -> p.length()).forEach(System.out::println);

    }
}
