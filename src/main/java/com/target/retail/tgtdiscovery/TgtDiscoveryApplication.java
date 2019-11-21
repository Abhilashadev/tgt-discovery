package com.target.retail.tgtdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TgtDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgtDiscoveryApplication.class, args);
	}

}
