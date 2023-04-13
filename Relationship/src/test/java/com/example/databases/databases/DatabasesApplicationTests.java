package com.example.databases.databases;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class DatabasesApplicationTests {

	@Autowired
	AuthorRepository repository;

	@Test
	//@Transactional
	//@Rollback(value = false)
	void testCreateAuthor() {
		Author at1=new Author();
		//Author at2 = new Author();
		//at1.setId(1);
		at1.setName("Devansh-Author");


		List<Book> subjectsList = new ArrayList<>();
		List<Book> subjectsList2 = new ArrayList<>();

		Book bh1 = new Book();
		Address add = new Address();
		//bh1.setId_book(0001);
		bh1.setAuthor(at1);
		bh1.setBookName("Hindi");
		subjectsList.add(bh1);
		add.setLocation("Kota Mahaveer extension");
		add.setState("Rajasthan");
		add.setStreetNo(45);
		//at1.setAddress(add);


		Book bh2 = new Book();
		//Address add2 = new Address();
		//bh2.setId_book(0002);
		bh2.setAuthor(at1);
		bh2.setBookName("English");
		subjectsList.add(bh2);
		add.setLocation("Jaipur RIICO Area");
		add.setState("Rajasthan");
		add.setStreetNo(12);
		at1.setAddress(add);

		at1.setBooksName(subjectsList);
		//at1.setBooksName(subjectsList2);


		repository.save(at1);

        /*
		subjectsList.add("Hindi");

		at1.setSubject(subjectsList);

		repository.save(at1);



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
		repository.save(ct1);*/

    /*@Test
	public void testCreateAuthor()
	{
		Author at1 = new Author();
		at1.setName("Devansh");
		List<Book> subjectsList = new ArrayList<>();
        Address add = new Address();
		Book bk1 = new Book();
		bk1.setBookName("Hibernate book");
		bk1.setAuthor(at1);
		subjectsList.add(bk1);
		add.setLocation("Kota Mahaveer extension");
		add.setState("Rajasthan");
		add.setStreetNo(45);
		at1.setAddress(add);
		at1.setBooksName(subjectsList);

		repository.save(at1);
		//System.out.println(save);
	}*/

        /*Which method on the session object can be used to remove an object from the cache?
		Answer --> clear();

		What does @transactional annotation do?*/

	}

}
