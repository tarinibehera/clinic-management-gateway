package com.clinic.management.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableDiscoveryClient
public class ClinicManagementGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicManagementGatewayApplication.class, args);
	}
}
