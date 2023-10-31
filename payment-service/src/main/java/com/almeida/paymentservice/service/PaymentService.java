package com.almeida.paymentservice.service;

import com.almeida.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);

}
