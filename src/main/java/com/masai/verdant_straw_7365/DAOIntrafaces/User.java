package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

public interface User {
    User findById(int id);
    
    List<User> findAll();
    
    void save(User user);
    
    void update(User user);
    
    void delete(User user);
}

