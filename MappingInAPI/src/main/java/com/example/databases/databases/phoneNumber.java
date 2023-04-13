package com.example.databases.databases;

import jakarta.persistence.*;

@Entity
public class phoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int pid;
    public int number;
    public String type;

    @ManyToOne
    @JoinColumn(name="customer_id")  //foreign key in table phone table that is the primary ker referenced with the Customer table
    private Customer customer;

    public phoneNumber(int pid, int number, String type, Customer customer) {
        this.pid = pid;
        this.number = number;
        this.type = type;
        this.customer = customer;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public phoneNumber() {
    }
}
