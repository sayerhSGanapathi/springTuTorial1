package com.springOne.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("GPay")
@Primary
public class GPaymentService implements PaymentService {


    public void processsPayment(double amount){

        System.out.println("Google Payment Service ");
        System.out.printf("Amount" + amount);
    }
}