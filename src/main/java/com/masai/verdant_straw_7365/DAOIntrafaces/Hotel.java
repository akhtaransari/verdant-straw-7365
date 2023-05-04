package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

public interface Hotel {
Hotel findById(int id);
    
    List<Hotel> findAll();
    
    void save(Hotel hotel);
    
    void update(Hotel hotel);
    
    void delete(Hotel hotel);
}
