package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return arg -> {
			log.info("Preloading " + repository.save(new Employee("Pmk", "Developer")));
			log.info("Preloading " + repository.save(new Employee("Yamone", "Admin")));
		};
	}
}
