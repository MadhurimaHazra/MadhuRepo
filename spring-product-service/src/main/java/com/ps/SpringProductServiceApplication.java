package com.ps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@SpringBootApplication
@EntityScan
@ComponentScan("com.ps")
public class SpringProductServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringProductServiceApplication.class, args);
	}

}
