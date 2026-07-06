package org.example;

//import org.example.dto.LoginRequest;

import org.example.records.LoginRequest;

public class FeatureOne {

    //FEATURE ONE: RECORDS
    //USED AS SUBSTITUTE TO DATA/DTP CLASSES
    //Java 16 official, Java 17 LTS
    //

    static void main() {
        //SUPPOSE WE WANT A POJO OF LOGINREQUEST

        //OLD WAY
        /*LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUname("admin");
        loginRequest.setPwd("admin");
        System.out.println(loginRequest.toString());*/

        //MODERN WAY : Using records
        LoginRequest loginRequest = new LoginRequest("admin", "admin");
        System.out.println(loginRequest);
        System.out.println(loginRequest.uname());
        System.out.println(loginRequest.pwd());

        //Records are immutable, readable, zero boiler plate code

    }



}
