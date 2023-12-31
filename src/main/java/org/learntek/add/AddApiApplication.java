package org.learntek.add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddApiApplication.class, args);
	}

}
