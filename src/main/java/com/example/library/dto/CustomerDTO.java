package com.example.library.dto;

public class CustomerDTO {

    private Long id;
    private String customerName;
    private String email;

    CustomerDTO(){

    }

    CustomerDTO(Long id , String customerName , String email)
    {
        this.id = id;
        this.customerName=customerName;
        this.email = email;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){

        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
}
