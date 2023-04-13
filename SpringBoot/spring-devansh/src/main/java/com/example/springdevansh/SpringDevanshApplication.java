package com.example.springdevansh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springdevansh")
public class SpringDevanshApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDevanshApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDevanshApplication.class, args);

		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);

		System.out.println(personDAO);
		LOGGER.info("{} ", personDAO.getJdbcConnect());

	}
}
