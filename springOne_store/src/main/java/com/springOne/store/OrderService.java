package com.springOne.store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService( PaymentService paymentService, int i){}

    @Autowired
    public OrderService(@Qualifier("stripe") PaymentService paymentServiceInst){
    this.paymentService = paymentServiceInst;
    }

    public void placeOrder () {
        paymentService.processsPayment(100);
    }
}
