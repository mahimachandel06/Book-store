package com.example.library.controllers;
import com.example.library.repo.CategoryRepo;
import com.example.library.models.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/api/categories")
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @PostMapping("/api/categories")
    public Category add(@RequestBody Category category) {
        
        return categoryRepo.save(category);
    }
    
    
    
}
