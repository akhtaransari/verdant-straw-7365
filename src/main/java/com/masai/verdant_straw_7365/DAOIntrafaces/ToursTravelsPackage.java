package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;


public interface ToursTravelsPackage {
    ToursTravelsPackage findById(int id);
    
    List<ToursTravelsPackage> findAll();
    
    void save(ToursTravelsPackage packages);
    
    void update(ToursTravelsPackage packages);
    
    void delete(ToursTravelsPackage packages);
}