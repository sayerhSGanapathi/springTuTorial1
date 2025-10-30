package com.springOne.store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiurl}")
    String apiUrl;

    @Value("${stripe.enabled}")
    Boolean stripeEnabled;

    @Value("${stripe.supported-currencies}")
    List<String> currencies;

    @Value("${stripe.timeout}")
    String timeout;

    public void processsPayment(double amount){

        System.out.println("Stripe Payment Service ");
        System.out.printf("Amount" + amount);
        System.out.println("API URL" + apiUrl);
        System.out.println("Timeout" + timeout);
        System.out.println("Enabled "+ stripeEnabled);
        System.out.println("currencies" + currencies);
    }
}
