package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FeatureTen {

    //FEATURE TEN: Date Time API of Java 8
    //java.time.*
    //https://docs.oracle.com/javase/8/docs/technotes/guides/datetime/index.html
    static void main() {
       dateTimeExample();
    }

    static void dateTimeExample(){
        LocalDateTime now = LocalDateTime.now();
        LocalDate.now();
        Instant.now(); //utc format

    }
}
