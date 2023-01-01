package org.ssn.strategic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class StrategicApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StrategicApplication.class, args);
	}

}
