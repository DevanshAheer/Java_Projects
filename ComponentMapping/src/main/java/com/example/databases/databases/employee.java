package com.example.databases.databases;
//Implement and demonstrate Embedded mapping using employee table having following fields:
// id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.cglib.proxy.Mixin;

@Entity
@Table(name ="employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String firstName;
    public String LastName;
    public int age;

    public address getAdd() {
        return add;
    }

    public void setAdd(address add) {
        this.add = add;
    }

    @Embedded
    private address add;

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
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public employee() {
    }

    public employee(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }
}
