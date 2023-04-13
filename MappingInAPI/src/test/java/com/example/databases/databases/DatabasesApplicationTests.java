package com.example.databases.databases;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class DatabasesApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Test
	void testCreateCustomer()
	{
		Customer ct1 = new Customer();

		ct1.setName("Krishna");
		//HashSet<phoneNumber> numbers= new HashSet<>(); // set of phoneNumber class type
		phoneNumber ph1 = new phoneNumber();
		ph1.setNumber(12345);  // many details of phone number is to be mapped to single user Devansh like setNumber, setType.
		ph1.setType("cell");
		//ph1.setCustomer(ct1);
		//numbers.add(ph1); // add object to the Hashsets.

		phoneNumber ph2 = new phoneNumber();
		ph2.setNumber(98765);  // many details of phone number is to be mapped to single user Devansh like setNumber, setType.
		ph2.setType("phone");
		//ph2.setCustomer(ct1);
		//numbers.add(ph2); // add object to the Hashsets.

		ct1.addPhoneNUmber(ph1);
		ct1.addPhoneNUmber(ph2);

		//ct1.setNumbers(numbers);
		repository.save(ct1);
	}

	@Test
	@Transactional
	public void testLoadCustomer()
	{
		Optional<Customer> custom = repository.findById(202);
		System.out.println(custom.get().getName()); // this will print the name of customer with the iven id

		Set<phoneNumber> setOfNumbers = custom.get().getNumbers();
		setOfNumbers.forEach(e -> System.out.println(e.getNumber()));
		// this will show the details of set of numbers of the customer with the same id given.

	}

	@Test
	public void testUpdateCustomer()
	{
		Customer custom = repository.findById(202).get();
		custom.setName("Devansh Aheer");

		Set<phoneNumber> setOfNumbers = custom.getNumbers();
		setOfNumbers.forEach(e -> e.setType("SmartPhone"));

		repository.save(custom);
	}

	@Test
	public void testDeleteCustomer()
	{
		repository.deleteById(202);
	}
}
