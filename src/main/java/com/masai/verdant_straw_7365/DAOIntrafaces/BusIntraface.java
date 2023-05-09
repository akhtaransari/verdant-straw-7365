package com.masai.verdant_straw_7365.DAOIntrafaces;

import java.util.List;

import com.masai.verdant_straw_7365.DTO.Bus;
import com.masai.verdant_straw_7365.DTO.Route;

public interface BusIntraface {
    boolean addBus(Bus bus);
    boolean deleteBus(int id);
    boolean addRoute(Route route);
    boolean deleteRoute(int id);
    List<BusIntraface> viewBuses();
    List<Route> viewRoutes();
}
