package org.example;

import java.util.concurrent.Executors;

public class FeatureEight {

    //FEATURE EIGHT - Virtual Threads - Project Loom
    //Java 21 fully released Virtual Threads (Project Loom) in September 2023 (JEP 444),
    // after previews in Java 19 and 20.
    //Traditional Thread = OS Threads (Limited in number)
    //Virtual Thread = JVM Thread
    //One traditional thread can handle many virtual threads
    //As many requests, as many virtual threads created in JVM
    //Traditional thread handling multiple JVM threads is called carrier thread
    //Since one traditional thread handling multiple JVM threads, will be mapped to one OS thread
    //Number of OS thread consumed will be less
    //This is how performance will be optimized
    //Summary: n virtual threads -> 1 traditional threads -> 1 os thread
    //Ratio: n:1:1
    static void main() {
        System.out.println("Hello from outside - " + Thread.currentThread().getName());
        virtualThreadExample();
    }

    static void virtualThreadExample() {
        try(var executors = Executors.newVirtualThreadPerTaskExecutor()){
            executors.submit(() -> {
                System.out.println("Hello from virtual thread 1 - " + Thread.currentThread().getName());
                while (true){
                    Thread.sleep(1000);
                    System.out.println("Still Alive");
                }
            });

            executors.submit(() -> {
                System.out.println("Hello from virtual thread 2 - " + Thread.currentThread().getName());
                System.out.println("Thread 2 is terminated");
            });
        }

    }
}
