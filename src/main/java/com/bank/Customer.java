package com.bank;

public class Customer {
    private int id;
    private String name;
    private String email;
    
    // Constructor to initialize customer details
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters for customer information
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
 
