package com.ar.javatech.ps.api.controller;

import com.ar.javatech.ps.api.entity.Payment;
import com.ar.javatech.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiate-payment")
    public Payment initiatePayment(@RequestBody Payment payment){
        return paymentService.processPayment(payment);
    }
}
