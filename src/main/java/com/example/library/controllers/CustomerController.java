package com.example.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.library.models.Customer;
import com.example.library.repo.CustomerRepo;
import java.util.List;



@RestController
@CrossOrigin("*")
public class CustomerController {
 
    @Autowired
     CustomerRepo customerRepo;

    @GetMapping("/api/customer")
    public List<Customer> getCustomers() {
        
        return customerRepo.findAll();
    }

    @PostMapping("/api/customer")
    public String AddCustomer(@RequestBody  Customer newCustomer) {
        
            customerRepo.save(newCustomer);
            return "add customer successfully";
    
    }
    
    
}
