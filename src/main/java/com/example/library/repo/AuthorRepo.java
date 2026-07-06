package com.example.library.repo;
import com.example.library.models.Author;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthorRepo extends JpaRepository<Author, Long>{

    
}
