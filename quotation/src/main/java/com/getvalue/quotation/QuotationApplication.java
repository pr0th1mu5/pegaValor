package com.getvalue.quotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class QuotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotationApplication.class, args);
	}

}
