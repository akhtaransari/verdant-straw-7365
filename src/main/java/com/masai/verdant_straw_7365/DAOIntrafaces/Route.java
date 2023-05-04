package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

public interface Route {
Route findById(int id);
    
    List<Route> findAll();
    
    void save(Route route);
    
    void update(Route route);
    
    void delete(Route route);
}
