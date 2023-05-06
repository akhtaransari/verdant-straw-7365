package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

import com.masai.verdant_straw_7365.DTO.Customer;

public interface User {
    User findById(int id);
    
    List<Customer> findAll();
    
    String save(Customer customer);
    
    void update(Customer customer);
    
    void delete(Customer customer);
}

