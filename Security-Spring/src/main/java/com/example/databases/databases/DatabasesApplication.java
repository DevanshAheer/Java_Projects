package com.example.databases.databases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class DatabasesApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DatabasesApplication.class, args);
		System.out.println("this is security user details service");

	}

}
