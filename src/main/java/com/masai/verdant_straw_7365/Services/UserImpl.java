package com.masai.verdant_straw_7365.Services;

import java.util.List;

import com.masai.verdant_straw_7365.DAOIntrafaces.User;
import com.masai.verdant_straw_7365.DTO.Customer;
import com.masai.verdant_straw_7365.DataBase.EMUtils;

import jakarta.persistence.EntityManager;

public class UserImpl implements User{

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Customer customer) {
	EntityManager em = EMUtils.getEntityManager();
	em.getTransaction().begin();
	em.persist(customer);
	em.getTransaction().commit();
	em.close();	
	
	return "User Added";
	
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	

}
