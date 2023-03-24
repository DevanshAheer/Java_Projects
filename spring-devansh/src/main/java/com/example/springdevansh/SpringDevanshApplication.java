package com.example.springdevansh;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDevanshApplication {

	public static void main(String[] args) {
		//The need for Spring comes here--->
		int[] A= {12,3,465,78};
		//(1) Write a program to demonstrate Tightly Coupled code.

		/* QuickSort Sort = new QuickSort(); //Tightly coupled.
		int check = Sort.SortImp(A,3);
		System.out.println(check+"-> Inside the Quick Sort Algorithms..");

		BubbleSort SortBubble = new BubbleSort();
		int check1 = Sort.SortImp(A,78);
		System.out.println(check1+"-> Inside the Bubble Sort Algorithms..");
 		//SpringApplication.run(SpringDevanshApplication.class, args);*/

		//private SortingImp Sort;

		//(2) Write a program to demonstrate Loosely Coupled code.
		//This is loose coupling where only need to give class object--->
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());

		//binarySearch.binarySearchImp(A,12);
		//System.out.println(binarySearchImp(A,12));

		//(3) Use @Component and @Autowired annotations to in
		// Loosely Coupled code for dependency management

		ConfigurableApplicationContext app = SpringApplication.run(SpringDevanshApplication.class, args);
		BinarySearchImpl binarySearch = app.getBean(BinarySearchImpl.class);
		binarySearch.binarySearchImp(A,12);
	}

}
