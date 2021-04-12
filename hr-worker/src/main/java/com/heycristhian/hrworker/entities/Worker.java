package com.heycristhian.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double dailyIncome;
	
	@Deprecated
	public Worker() {}
	
	private Worker(WorkerBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.dailyIncome = builder.dailyIncome;
	}
	
	public static WorkerBuilder builder() {
		return new WorkerBuilder();
	}
	
	public static class WorkerBuilder {
		private Long id;
		private String name;
		private Double dailyIncome;
		
		public WorkerBuilder id(Long id) {
			this.id = id;
			return this;
		}
		
		public WorkerBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public WorkerBuilder dailyIncome(Double dailyIncome) {
			this.dailyIncome = dailyIncome;
			return this;
		}
		
		public Worker build() {
			return new Worker(this);
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

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
