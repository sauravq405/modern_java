package org.example;

public class FeatureFour {
    //FEATURE FOUR: SWITCH WITH PATTERN MATCHING
    //Switch Expression syntax was introduced as a standard feature in Java 21.
    //
    static void main() {
        switchWithPatternMatching("Monday");
        switchWithPatternMatching(1);
    }

    static void switchWithPatternMatching(Object obj){
        String dayOfWeek = switch (obj){
            case String str -> {
                System.out.println("Object is string");
                yield  str.toUpperCase();
            }
            case Integer i -> {
                System.out.println("Object is integer");
                yield  String.valueOf(i);
            }
            default -> "no match found";
        };
        System.out.println(dayOfWeek);
    }
}
