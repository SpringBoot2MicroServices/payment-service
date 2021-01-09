package com.ar.javatech.ps.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {

		System.out.println(" ################ PaymentServiceApplication running... ################ ");

		SpringApplication.run(PaymentServiceApplication.class, args);
	}
}
