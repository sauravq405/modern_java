package org.example;

public class FeatureTwo {

    //FEATURE TWO: PATTERN MATCHING
    //This feature, known as Pattern Matching for instanceof,
    // was officially introduced as a permanent feature in Java 16 (March 2021).
    //No casting is required
    //Used for validations

    static void main() {
        patternMatchingExample("hello");
    }

    //OLD WAY
    /*static void patternMatchingExample(Object object){
            if(object instanceof String){
                String str = (String) object;
                System.out.println(str.length());
                System.out.println("ok done");
            }
    }*/

    static void patternMatchingExample(Object object){
        if(object instanceof String str){
            System.out.println(str.length());
            System.out.println("ok done");
        } else {
            System.out.println("not a string");
        }
    }
}
