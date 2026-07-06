package com.example.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.example.library.models.Author;
import com.example.library.repo.AuthorRepo;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
public class AuthorController {

    @Autowired
     AuthorRepo authorRepo;

    @GetMapping("/api/author")
    public List<Author> getAuthors() {

        return authorRepo.findAll();
    }

    @PostMapping("/api/author")
    public Author  addAuthor(@RequestBody Author newAuthor) {

       return  authorRepo.save(newAuthor);
    }

}
