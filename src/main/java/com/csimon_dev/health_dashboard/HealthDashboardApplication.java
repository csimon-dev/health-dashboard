package com.csimon_dev.health_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Currently points to our in-memory(h2) database
@SpringBootApplication
public class HealthDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthDashboardApplication.class, args);
	}

}
