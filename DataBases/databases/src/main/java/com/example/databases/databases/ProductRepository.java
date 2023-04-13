package com.example.databases.databases;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> {
    List<Product> findByName(String Name);

    List<Product> findByNameContains(String Name);

    List<Product> findByNameStartsWith(String Name);

    List<Product> findByAgeBetween(int Age, int Age1);

    //List<Product> findByAllPaging(int Age, Pageable pg);
}
