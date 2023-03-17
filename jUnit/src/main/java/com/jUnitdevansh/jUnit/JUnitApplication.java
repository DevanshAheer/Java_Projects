package com.jUnitdevansh.jUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.jUnit.*;

@SpringBootApplication
public class JUnitApplication {

	@Test
	public static void testArraySort_RandomArray()
	{
		int[] numbers = {12,4,3,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	public static void main(String[] args) {

		SpringApplication.run(JUnitApplication.class, args);
	}

}
