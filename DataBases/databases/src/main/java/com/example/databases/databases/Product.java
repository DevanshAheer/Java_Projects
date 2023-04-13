package com.example.databases.databases;

import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    private int age;
    @Column(name ="location")
    private String location;

    public Product(int id, String name,int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return location;
    }

    public void setDesc(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + id +
                ", name='" + name + '\'' +", Age="+age+
                ", Loacation='" + location + '\'' +
                '}';
    }
}
