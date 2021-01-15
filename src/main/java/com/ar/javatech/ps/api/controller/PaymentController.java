package com.ar.javatech.ps.api.controller;

import com.ar.javatech.ps.api.entity.Payment;
import com.ar.javatech.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
@CrossOrigin("/*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiate-payment")
    public Payment initiatePayment(@RequestBody Payment payment){

        return paymentService.processPayment(payment);
    }

    @GetMapping("/{orderId}")
    public List<Payment> getOrderHistory(@PathVariable int orderId){
        return paymentService.findOrderHistoryByOrderId(orderId);
    }
}
