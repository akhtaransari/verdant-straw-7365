package com.masai.verdant_straw_7365.DAOIntrafaces;

import com.masai.verdant_straw_7365.DTO.Travels;
import com.masai.verdant_straw_7365.DTO.Package;

public interface ToursAndTravelsPackageManagement {
	
	void createPackage(Package pkg);
	boolean deletePackage(int id);
	
	void createTravels(Travels travels);
	boolean deleteTravels(int id);

}
