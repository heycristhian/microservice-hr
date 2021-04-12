package com.heycristhian.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	@Deprecated
	public Payment() {}
	
	
	public Payment(PaymentBuilder builder) {
		this.name = builder.name;
		this.dailyIncome = builder.dailyIncome;
		this.days = builder.days;
	}

	
	public static PaymentBuilder builder () {
		return new PaymentBuilder();
	}

	public static class PaymentBuilder {
		private String name;
		private Double dailyIncome;
		private Integer days;
		
		public PaymentBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PaymentBuilder dailyIncome(Double dailyIncome) {
			this.dailyIncome = dailyIncome;
			return this;
		}
		
		public PaymentBuilder days(Integer days) {
			this.days = days;
			return this;
		}
		
		public Payment build() {
			return new Payment(this);
		}
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getDailyIncome() {
		return dailyIncome;
	}


	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}


	public Integer getDays() {
		return days;
	}


	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return this.days * this.dailyIncome;
	}
	
}
