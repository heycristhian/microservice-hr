package com.heycristhian.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.heycristhian.hrpayroll.entities.Payment;
import com.heycristhian.hrpayroll.entities.Worker;
import com.heycristhian.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return Payment.builder()
				.name(worker.getName())
				.dailyIncome(worker.getDailyIncome())
				.days(days)
				.build();
	}

}
