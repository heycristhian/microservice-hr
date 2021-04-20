package com.heycristhian.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heycristhian.hrworker.entities.Worker;
import com.heycristhian.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;

	public List<Worker> findAll() {
		List<Worker> workers = repository.findAll();
		return workers;
	}

	public Worker findById(Long id) {
		Optional<Worker> worker = repository.findById(id);
		
		if (worker.isPresent()) {
			return worker.get();
		}
		return null;
	}

}
