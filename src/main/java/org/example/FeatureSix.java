package org.example;

import java.util.HashMap;
import java.util.UUID;

public class FeatureSix {

    //FEATURE FIVE: var - Local Type Inference
    // use var keyword to declare local variables
    // Java 10 introduced var for local variable type inference (JEP 286) in March 2018.
    static void main() {

        localVariablesUsingVarKeyword();

    }

    private static void localVariablesUsingVarKeyword() {
        var name = "Ankur";
        var salary = 54893.76;
        var age = 25;
        var index = new HashMap<String, Integer>();
        index.put("Ankur", 1);
        //FOR BEST PRACTICE: USE EXACT TYPE DURING METHOD CALL ASSIGNATIONS,
        //TO AVOID AMBIGUITY IN FEATURE READING
        String randomName = getRandomName();
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(index);
    }

    private static void localVariablesWithOutVarKeywordInOldWay() {
        String name = "Ankur";
        double salary = 54893.76;
        int age = 25;
        HashMap<String, Integer> index = new HashMap<String, Integer>();
        index.put("Ankur", 1);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(index);
    }

    private static String getRandomName(){
        return UUID.randomUUID().toString();
    }

}
