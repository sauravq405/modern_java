package org.example.dto;

public class BMWEngine extends Engine{
    public BMWEngine(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("name can not be null");
        }
        super(name);
        System.out.println("BMWEngine instance created");
    }
}
