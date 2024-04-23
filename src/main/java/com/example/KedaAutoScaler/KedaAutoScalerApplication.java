package com.example.KedaAutoScaler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KedaAutoScalerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KedaAutoScalerApplication.class, args);
	}

}
