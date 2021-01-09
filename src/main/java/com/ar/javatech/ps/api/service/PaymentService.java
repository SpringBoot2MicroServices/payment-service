package com.ar.javatech.ps.api.service;

import com.ar.javatech.ps.api.entity.Payment;
import com.ar.javatech.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;


    public Payment processPayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}
