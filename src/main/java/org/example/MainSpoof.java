package org.example;

public class MainSpoof {

    private String s = "SUCCESS";

    static void main() {
        MainSpoof m = new MainSpoof();
        m.customerPortal();
        m.smsService();
        m.auditService();
    }

    private void smsService(){
        s = "FAILED";
        System.out.println("smsService(): "+s);
    }
    private void customerPortal(){
        System.out.println("customerPortal(): "+s);
    }
    private void auditService(){
        System.out.println("auditService(): "+s);
    }

}
