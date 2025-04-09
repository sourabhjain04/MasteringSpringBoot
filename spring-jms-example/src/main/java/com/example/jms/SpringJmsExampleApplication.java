package com.example.jms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJmsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsExampleApplication.class, args);
	}
	@Bean
    public CommandLineRunner run(ApplicationContext ctx, JmsSender jmsSender) {
        return args -> {
            jmsSender.sendMessage("Hello, Jakarta JMS with ActiveMQ Artemis!");
        };
    }
}
