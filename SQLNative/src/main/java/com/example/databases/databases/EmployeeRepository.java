package com.example.databases.databases;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeTable, Integer> {

    /*(1)Display the first name, last name of all employees having salary greater
              than average salary ordered in ascending by their age and in descending by their salary.*/

    @Query("from EmployeeTable")
    List<EmployeeTable> findEmployeeByName();

    @Query("select e.firstName, e.lastName from EmployeeTable e where e.salary > (select avg(e.salary) from EmployeeTable)")
    List<EmployeeTable> findEmployeeBySort();

    /*(2)Update salary of all employees by a salary passed as a parameter whose existing
    salary is less than the average salary.*/


    @Modifying
    @Query("update EmployeeTable set salary =:sal where salary<:avgsal")
    void findEmployeeByUpdate(@PathParam("sal") int sal, @PathParam("avgsal")int avgsal);

    //(3)Delete all employees with minimum salary*/

    @Modifying
    @Query("delete from EmployeeTable where salary=:sal")
    void findEmployeeByDelete(@PathParam("sal") int sal);

// Display the id, first name, age of all employees where last name ends with "singh"

    @Modifying
    @Query(value = "select emp_id, emp_first_name, emp_age from employee_table where emp_last_name like 'Yadav' ", nativeQuery = true )
    List<Object[]> findEmployeeByLastName();

//    Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Query(value = "delete from employee_table where emp_age > 25 ", nativeQuery = true )
    void findEmployeeByAge();

    //Implement and demonstrate Embedded mapping using employee table having following fields:
    // id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
}
