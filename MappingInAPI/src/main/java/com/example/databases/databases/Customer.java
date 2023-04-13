package com.example.databases.databases;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int cid;
    public String name;

    @OneToMany(mappedBy = "customer")
    private Set<phoneNumber> numbers;
    public Customer() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }
}
