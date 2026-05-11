package com.csimon_dev.health_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Just to cheese making it run properly on my first start
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Remove the (exclude...) everything within the brackets later
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HealthDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthDashboardApplication.class, args);
	}

}
