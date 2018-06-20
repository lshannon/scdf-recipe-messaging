package com.example.lukeshannon.CustomJMSSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication

@Import(org.springframework.cloud.stream.app.jms.source.JmsSourceConfiguration.class)
public class CustomJmsSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomJmsSourceApplication.class, args);
	}
}
