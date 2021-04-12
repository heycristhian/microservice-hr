package com.heycristhian.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.heycristhian.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return Payment.builder()
				.name("Cristhian Dias")
				.dailyIncome(250.00)
				.days(days)
				.build();
	}

}
