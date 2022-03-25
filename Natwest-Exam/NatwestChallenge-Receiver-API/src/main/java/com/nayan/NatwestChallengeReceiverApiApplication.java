package com.nayan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NatwestChallengeReceiverApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatwestChallengeReceiverApiApplication.class, args);
	}

}
