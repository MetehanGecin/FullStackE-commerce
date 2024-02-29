package com.metehangecin.ecommerce.service;

import com.metehangecin.ecommerce.dto.PaymentInfo;
import com.metehangecin.ecommerce.dto.Purchase;
import com.metehangecin.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
