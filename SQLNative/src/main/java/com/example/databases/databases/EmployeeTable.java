package com.example.databases.databases;

import jakarta.persistence.*;

@Entity
@Table(name ="employee_table")
public class EmployeeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="emp_id", length=50)
    public int id;
    @Column(name="emp_first_name", length=50)
    public String firstName;
    @Column(name="emp_last_name", length=50)
    public String lastName;
    @Column(name="emp_salary", length=50)
    public Long salary;
    @Column(name="emp_age", length=50)
    public int age;

    public EmployeeTable(int id, String firstName, String lastName, Long salary, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public EmployeeTable() {
    }

    @Override
    public String toString() {
        return "EmployeeTable{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
