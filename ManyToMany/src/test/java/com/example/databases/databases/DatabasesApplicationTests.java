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
	ProgrammerRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void testCreateProgrammer()
	{
		Programmer program = new Programmer();
        //program.setId(0001);
		program.setName("Devansh-Programmer-Specialist");
		program.setSalary(1000000000);

		Set<Projects> projectsSet = new HashSet<>();
		Projects pro = new Projects();
		pro.setName("Hibernate Project");
		projectsSet.add(pro);

		Projects pro2 = new Projects();
		pro2.setName("Security Oauth Project");
		projectsSet.add(pro2);

		program.setProjects(projectsSet);

		repository.save(program);
	}

	@Test
	@Transactional // this only for Cache type --> eager
	void testFindProgrammer()
	{
		Optional<Programmer> pro = repository.findById(1);
		System.out.println(pro);
	}
}
