package com.zhdanovich.footballtables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FootballTablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballTablesApplication.class, args);
	}

}
