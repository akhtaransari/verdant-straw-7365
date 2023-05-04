package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;


public interface HotelBooking {
	HotelBooking findById(int id);
    
    List<HotelBooking> findAll();
    
    void save(HotelBooking booking);
    
    void update(HotelBooking booking);
    
    void delete(HotelBooking booking);
}
