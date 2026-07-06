package com.example.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.models.Book;
import com.example.library.repo.BookRepo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@CrossOrigin("*")
public class BookController {

  @Autowired
  private BookRepo bookRepo;

 


  @GetMapping("/api/books")
  public List<Book> getBooks(){

    return bookRepo.findAll();
  }
  
  @PostMapping("/api/books")
  public String  addBook(@RequestBody Book newBook) {
      
     bookRepo.save(newBook);
     return "success";
    
  }

}
