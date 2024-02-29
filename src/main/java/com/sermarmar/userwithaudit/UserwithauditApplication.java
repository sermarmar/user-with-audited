package com.sermarmar.userwithaudit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EnableEnversRepositories
@SpringBootApplication
public class UserwithauditApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserwithauditApplication.class, args);
	}

}
