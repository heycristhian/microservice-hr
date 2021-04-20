package com.heycristhian.hruser.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heycristhian.hruser.entities.User;
import com.heycristhian.hruser.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User findByEmail(String email) {
		return repository.findByEmail(email);
	}

	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}
}
