package org.example;

public class FeatureThree {

    //FEATURE THREE: ENHANCED SWITCH OR SWITCH EXPRESSION
    //Switch Expression syntax was introduced as a standard feature in Java 14.
    //
    static void main() {
        switchExpressionExample("Monday");
    }

    //OLD WAY
    /*static void switchExpressionExample(String day){
        switch (day){

            case "Monday":
                System.out.println("Today is Monday");
                break;

            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;

            default:
        }
    }*/

    static void switchExpressionExample(String day){
        String dayOfWeek = switch (day){
           case "Monday" -> "This is Monday";
           case "Tuesday" -> "This is Tuesday";
           case "Wednesday" -> {
               System.out.println("Day of week");
               yield  "This is Wednesday";
           }
           default -> "No day matched";
        };
        System.out.println(dayOfWeek);
    }
}
