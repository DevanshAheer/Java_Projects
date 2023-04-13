package com.example.databases.databases;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class DatabasesApplicationTests {

	@Test
	void contextLoads() {

	}
	@Test
	private void test()
	{
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

		List<String> filteredTodos = todoServiceStub.retrieveTodo("learn");

		assertEquals(2, filteredTodos.size());
	}

}
