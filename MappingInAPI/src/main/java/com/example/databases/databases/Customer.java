package com.example.databases.databases;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int cid;
    public String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER) // to reflect the actions to child class.
    //default OneToMany fetch type is LAZY.
    public Set<phoneNumber> numbers;

    public Customer() {
    }

    public void addPhoneNUmber(phoneNumber number)
    {
        if(number!=null)
        {
            if(numbers==null)
                numbers = new HashSet<>();
        }
        number.setCustomer(this);
        numbers.add(number);
    }

    public Set<phoneNumber> getNumbers()
    {
        return numbers;
    }

    public void setNumbers(Set<phoneNumber> numbers)
    {
        this.numbers= numbers;
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

    public Customer(int cid, String name, Set<phoneNumber> numbers) {
        this.cid = cid;
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }
}
