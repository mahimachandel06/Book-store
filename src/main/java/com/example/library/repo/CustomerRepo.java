package com.example.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.models.Customer;


public interface CustomerRepo extends JpaRepository<Customer , Long>{
   
}
