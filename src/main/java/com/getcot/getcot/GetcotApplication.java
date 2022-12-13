package com.getcot.getcot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GetcotApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetcotApplication.class, args);
	}

}
