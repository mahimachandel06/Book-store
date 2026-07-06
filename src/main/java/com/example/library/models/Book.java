package com.example.library.models;


import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private boolean available = true;


    Book()
    {

    }

    Book(Long id , String title ,boolean available, Category category , Author author)
    {   
        this.id = id;
        this.title = title;
        this.available = available;
        this.category = category;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id)
    { this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author author){

        this.author = author;
    }

    
}
