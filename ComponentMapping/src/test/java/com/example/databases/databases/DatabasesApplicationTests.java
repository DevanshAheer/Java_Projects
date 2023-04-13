package com.example.databases.databases;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatabasesApplicationTests {

	@Autowired
	employeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void testCreate()
	{
		employee entity = new employee();
		entity.setId(7);
		entity.setFirstName("Devansh");
		entity.setLastName("Aheer");
		entity.setAge(21);

		address add = new address();
		add.setBasicSalary(2000000);
		add.setBonusSalary(1000000);
		add.setSpecialAllowanceSalary(500000);
		add.setTaxAmount(700000);

		entity.setAdd(add);
		repository.save(entity);
	}


}
