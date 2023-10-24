package com.almeida.paymentservice.service;

import com.almeida.paymentservice.model.Payment;
import com.almeida.paymentservice.resource.PaymentResource;

public interface PaymentService {
    void sendPayment(Payment payment);

}
