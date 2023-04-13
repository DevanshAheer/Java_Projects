package com.example.databases.databases;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class DatabasesApplicationTests {

	@Autowired
	EmployeeRepository repository;
	/*@Test
	void contextLoads() {
	}*/

	@Test
	void testEmployeeCreate()
	{
		EmployeeTable emp= new EmployeeTable();
		emp.setId(1);
		emp.setFirstName("Devansh");
		emp.setLastName("Aheer");
		emp.setSalary((long) 90000.567);
		emp.setAge(22);

		EmployeeTable emp1= new EmployeeTable();
		emp1.setId(2);
		emp1.setFirstName("Arjun");
		emp1.setLastName("Sharma");
		emp1.setSalary((long) 78000.567);
		emp1.setAge(23);

		EmployeeTable emp2= new EmployeeTable();
		emp2.setId(3);
		emp2.setFirstName("Mayank");
		emp2.setLastName("Jain");
		emp2.setSalary((long) 70000.567);
		emp2.setAge(23);

		EmployeeTable emp3= new EmployeeTable();
		emp3.setId(4);
		emp3.setFirstName("Prakher");
		emp3.setLastName("Sharma");
		emp3.setSalary((long) 55000.567);
		emp3.setAge(25);

		EmployeeTable emp4= new EmployeeTable();
		emp4.setId(5);
		emp4.setFirstName("Ajit");
		emp4.setLastName("Kumar");
		emp4.setSalary((long) 50700.567);
		emp4.setAge(26);

		EmployeeTable emp5= new EmployeeTable();
		emp5.setId(6);
		emp5.setFirstName("Sanjay");
		emp5.setLastName("Yadav");
		emp5.setSalary((long) 80000.567);
		emp5.setAge(24);

		EmployeeTable emp6= new EmployeeTable();
		emp6.setId(7);
		emp6.setFirstName("Dev");
		emp6.setLastName("Anand");
		emp6.setSalary((long) 97000.567);
		emp6.setAge(23);

		EmployeeTable emp7= new EmployeeTable();
		emp7.setId(8);
		emp7.setFirstName("Aman");
		emp7.setLastName("Singh");
		emp7.setSalary((long) 90000.567);
		emp7.setAge(25);

		repository.save(emp);
		repository.save(emp1);
		repository.save(emp2);
		repository.save(emp3);
		repository.save(emp4);
		repository.save(emp5);
		repository.save(emp6);
		repository.save(emp7);

	}

	@Test
	public void testFindEmployeeByName()
	{
		System.out.println(repository.findEmployeeByName());
	}

	@Test
	public void testFindEmployeeBySort()
	{
		System.out.println(repository.findEmployeeBySort());
	}



	@Test
	@Transactional
	//@Rollback(false)
	public void testFindEmployeeByUpdate()
	{
		repository.findEmployeeByUpdate((int) 80000.98,(int)76337.50);
	}
	@Test
	@Transactional
	public void testFindEmployeeByDelete()
	{
		repository.findEmployeeByDelete((int) 75008.45);
	}


	@Test
	@Transactional
	public void testFindEmployeeByLastName()
	{
		List<Object[]> list = repository.findEmployeeByLastName();
		for(Object[] obj : list)
		{
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		}
	}

	@Test
	@Transactional
	public void testFindEmployeeByAge()
	{
		repository.findEmployeeByAge();
	}

}
