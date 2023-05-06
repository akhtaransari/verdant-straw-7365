package com.masai.verdant_straw_7365.Services;

import com.masai.verdant_straw_7365.DAOIntrafaces.ToursAndTravelsPackageManagement;
import com.masai.verdant_straw_7365.DTO.Package;
import com.masai.verdant_straw_7365.DTO.Travels;
import com.masai.verdant_straw_7365.DataBase.EMUtils;

import jakarta.persistence.EntityManager;

public class ToursAndTravelsPackageManagementImple implements ToursAndTravelsPackageManagement{

	@Override
	public void createPackage(Package pkg) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(pkg);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public boolean deletePackage(int id) {
		EntityManager em = EMUtils.getEntityManager();
		Package pkg =  em.find(Package.class, id);
		
		if (pkg == null) {
			return false;
		}else {
			String sql = "DELETE FROM Package e WHERE e.id = :id";
			em.getTransaction().begin();
			em.createQuery(sql).setParameter("id", id).executeUpdate();
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
		
	}

	@Override
	public void createTravels(Travels travels) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(travels);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public boolean deleteTravels(int id) {
		
		EntityManager em = EMUtils.getEntityManager();
		Travels pkg =  em.find(Travels.class, id);
		
		if (pkg == null) {
			return false;
		}else {
			String sql = "DELETE FROM Travels e WHERE e.id = :id";
			em.getTransaction().begin();
			em.createQuery(sql).setParameter("id", id).executeUpdate();
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
	}


}
