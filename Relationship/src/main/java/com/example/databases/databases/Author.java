package com.example.databases.databases;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "author_id")
    public int at_id;

    public String name;

    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany(mappedBy= "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Book> booksName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return at_id;
    }

    public void setId(int at_id) {
        this.at_id = at_id;
    }

    public List<Book> getBooksName() {
        return booksName;
    }

    public void setBooksName(List<Book> booksName) {
        this.booksName = booksName;
    }

    public Author() {
        this.at_id = at_id;
        this.name = name;
        this.address = address;
        this.booksName = booksName;
    }
}

