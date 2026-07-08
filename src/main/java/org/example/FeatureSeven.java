package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class FeatureSeven {


    //FEATURE SEVEN : Streams - Functional Data Processing
    //Java 8 introduced the Streams API and functional programming concepts
    // (like lambdas and functional interfaces) in March 2014.
    static void main() {
        streamProcessingExamples();
    }

    static void streamProcessingExamples(){
        var integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = integers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        IO.println(evenNumbers);
        evenNumbers.forEach(System.out::println);
        List<Integer> doubledEvenIntegers = evenNumbers.stream().map(i -> i * 2).collect(Collectors.toList());
        Integer doubledEvenIntegerSum = doubledEvenIntegers.stream()
                .reduce((accumulator, integer) -> accumulator + integer)
                .orElse(0);
        System.out.println(doubledEvenIntegerSum);

        doubledEvenIntegers.stream()
                .reduce((accumulator, integer) -> accumulator + integer)
                .ifPresentOrElse(sum -> {
                    System.out.println("Sum = "+sum);
                }, () -> {
                    System.out.println("No sum");
                });
    }
}
