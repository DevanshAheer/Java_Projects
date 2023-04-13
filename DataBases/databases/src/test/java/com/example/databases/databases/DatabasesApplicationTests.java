package com.example.databases.databases;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// (2) Set up EmployeeRepository with Spring Data JPA
@SpringBootTest
class DatabasesApplicationTests {

	@Autowired
	ProductRepository repository;

	@Autowired
	EntityManager entityManager;

	/*@Test
	public void contextLoad()
	{

	}*/

	@Test  //			(3) Perform Create Operation on Entity using Spring Data JPA
	public void testCreate()
	{
		Product product = new Product();
		product.setId(1);
		product.setAge(21);
		product.setName("Devansh");
		product.setDesc("Kota");

		Product product1 = new Product();
		product1.setId(2);
		product1.setAge(22);
		product1.setName("Dev");
		product1.setDesc("Jaipur");

		Product product2 = new Product();
		product2.setId(3);
		product2.setAge(25);
		product2.setName("Krishan");
		product2.setDesc("Vrindavan");

		Product product3 = new Product();
		product3.setId(4);
		product3.setAge(26);
		product3.setName("Arjun");
		product3.setDesc("Mahabharat");

		Product product4 = new Product();
		product4.setId(5);
		product4.setAge(24);
		product4.setName("Bali");
		product4.setDesc("Panchvatika");

		Product product5 = new Product();
		product5.setId(6);
		product5.setAge(30);
		product5.setName("Ravan");
		product5.setDesc("Lanka");

		repository.save(product2);
		repository.save(product3);
		repository.save(product4);
		repository.save(product5);

	}

	@Test  //(5) Perform Read Operation on Entity using Spring Data JPA
	void testRead()
	{
		Product product = repository.findById(1).get();
		assertNotNull(product);
		assertEquals("Devansh", product.getName());
		System.out.println("------------------------------------_>>>>"+product.getDesc());
	}

	@Test  //(4) Perform Update Operation on Entity using Spring Data JPA
	public void testUpdate()
	{
		Product product = repository.findById(4).get();
		product.setName("Bhagwan");
		repository.save(product);
	}

	@Test //	(6) Get the total count of the number of Employees
    public void count()
	{
		System.out.println((long) repository.count());
	}

	/*@Test  //	(5) Perform Delete Operation on Entity using Spring Data JPA
	public void testDelete()  // This is delete operation
	{
		Product product = repository.findById(2).get();
		repository.delete(product);
	}*/

	@Test //(8) Create and use finder to find Employee by Name
	public void testFindByName()
	{
		List<Product> products = repository.findByName("Devansh");
		products.forEach(e -> System.out.println(e.getAge()));
	}

	@Test // Create and use finder to find Employees starting with R character
	public void testFindByNameContains()// return the Names where it contains "R"
	{
		List<Product> products = repository.findByNameContains("R");
		products.forEach(e -> System.out.println(e.getName()));

	}

	@Test //(9) Create and use finder to find Employees starting with R character
	public void testFindByNameStartsWith()
	{
		List<Product> products = repository.findByNameStartsWith("R");
		products.forEach(e -> System.out.println(e.getName()));

	}

	@Test //(10) Create and use finder to find Employees Between the age of 25 to 32
	public void testFindByAgeBetween()
	{
		List<Product> products = repository.findByAgeBetween(25, 32);
		products.forEach(e -> System.out.println(e.getName()));
	}

	@Test //(7) Implement Pagination and Sorting on the bases of Employee Age
	public void testFindByAllPaging() {
		Pageable pg = PageRequest.of(0, 2, Sort.by("age")); // getting the page ->0 with size 2 per page

		Page<Product> results = repository.findAll(pg);
		results.forEach(p -> System.out.println(p.getName()));

	}
}
