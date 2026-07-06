package com.example.library.models;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;

import java.util.List;



@Entity
public class Author {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String nationality;

    @OneToMany(mappedBy = "author")

    private List<Book> book;

    Author(){

    }
    
    Author(Long id, String name , String nationality, List<Book> book)
    {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.book = book;
    }

    public Long getId(){
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

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
            this.nationality = nationality;

    }
    public List<Book> getBooks(){

        return book;
    }
    public void setBooks(List<Book> book){
        this.book = book;
    }
    

}
