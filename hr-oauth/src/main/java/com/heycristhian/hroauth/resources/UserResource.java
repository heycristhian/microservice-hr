package com.heycristhian.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heycristhian.hroauth.entities.User;
import com.heycristhian.hroauth.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User user = service.findByEmail(email);
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	} 

}
