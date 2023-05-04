package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

public interface Ticket {
	Ticket findById(int id);
    
    List<Ticket> findAll();
    
    void save(Ticket ticket);
    
    void update(Ticket ticket);
    
    void delete(Ticket ticket);
}
