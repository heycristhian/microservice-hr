package com.heycristhian.hruser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.heycristhian.hruser.entities.User;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private static Logger logger = LoggerFactory.getLogger(HrUserApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// logger.info("BCRYPT = " + passwordEncoder.encode("123456789"));
	}

}
