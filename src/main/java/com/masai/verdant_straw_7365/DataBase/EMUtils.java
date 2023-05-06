package com.masai.verdant_straw_7365.DataBase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class EMUtils {	
	public static EntityManager getEntityManager () {
		return Persistence.createEntityManagerFactory("verdant-straw-7365").createEntityManager();
	}
}
