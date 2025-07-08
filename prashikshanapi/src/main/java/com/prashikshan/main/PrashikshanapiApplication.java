package com.prashikshan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class PrashikshanapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrashikshanapiApplication.class, args);
		log.info("Prashikshan Application Started!!");
	}

}
