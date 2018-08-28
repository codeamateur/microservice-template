package com.zjx.dev.template.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringCloudApplication
@EnableHystrixDashboard
@EnableTurbine
public class TemplateMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateMonitoringApplication.class, args);
	}

}
