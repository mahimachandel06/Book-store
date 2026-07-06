package com.example.library.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> book;

    public Category(String name , List<Book> book , Long id){

        this.name = name;
        this.book = book;
        this.id = id;
    }
    public Category(){

    }
    public  Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public List<Book> getBooks(){
        return book;
    }

    public void setBooks(List<Book> book)
    {
        this.book = book;
    }
}
