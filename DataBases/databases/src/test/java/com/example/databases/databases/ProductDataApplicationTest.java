package com.example.databases.databases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDataApplicationTest {

    @Autowired
    ProductRepository repository;
}
