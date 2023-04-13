package com.example.databases.databases;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="book")
public class Book {

    // OneToMany ---One Author and Many---Books
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "Book_id")
    public int id;

    public String bookName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")  //foreign key in table phone table that is the primary ker referenced with the Customer table
    public Author author;

    public Book(String bookName, Author author) {

        this.bookName = bookName;
        this.author = author;
    }

    public int getId_book() {
        return id;
    }

    public void setId_book(int id) {
        this.id = id;
    }

    public Book() {
    }

   public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
