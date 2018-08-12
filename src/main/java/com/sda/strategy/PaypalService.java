package com.sda.strategy;

public class PaypalService {
    public void logInToPaypal(){
        System.out.println("logging to Paypal");
    }

    public void depositToPaypalAccount(int amount){
        System.out.println("deposit some money");
    }

    public void requestPayment(String from, String to, int amount){
        System.out.println("Requesting payment");
    }
}
