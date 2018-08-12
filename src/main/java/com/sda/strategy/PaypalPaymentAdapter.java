package com.sda.strategy;

import com.sda.adapter.domain.Payment;

public class PaypalPaymentAdapter implements Payment {

    private PaypalService paypalService;

    public PaypalPaymentAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public void pay(int amountInPln) {
        paypalService.depositToPaypalAccount(amountInPln);
        paypalService.depositToPaypalAccount(amountInPln);
        paypalService.requestPayment("","",100);

    }
}
