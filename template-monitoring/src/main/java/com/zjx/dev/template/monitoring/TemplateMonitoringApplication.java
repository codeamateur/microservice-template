package com.zjx.dev.template.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class TemplateMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateMonitoringApplication.class, args);
	}
}
