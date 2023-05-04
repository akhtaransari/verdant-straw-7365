package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

public interface Bus {
Bus findById(int id);
    
    List<Bus> findAll();
    
    void save(Bus bus);
    
    void update(Bus bus);
    
    void delete(Bus bus);
}
