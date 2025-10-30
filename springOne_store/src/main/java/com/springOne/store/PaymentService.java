package com.springOne.store;

public interface PaymentService {

    public default void processsPayment(double amount) {
    }
}
