package com.example.databases.databases;

import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {


}
