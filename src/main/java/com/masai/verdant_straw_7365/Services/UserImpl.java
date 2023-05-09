package com.masai.verdant_straw_7365.Services;

import java.util.List;

import com.masai.verdant_straw_7365.DAOIntrafaces.User;
import com.masai.verdant_straw_7365.DTO.Customer;
import com.masai.verdant_straw_7365.DataBase.EMUtils;

import jakarta.persistence.EntityManager;

public class UserImpl implements User{

	@Override
	public Customer findById(int id) {
		return  EMUtils.getEntityManager().find(Customer.class,id);
		
	}

	@Override
	public List<Customer> findAll() {
		return EMUtils.getEntityManager().createQuery("SELECT e FROM Customer e").getResultList();
		
	}

	@Override
	public String save(Customer customer) {
		
		EntityManager em = EMUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		em.close();	
		
		return "Customer Added";

	}

	@Override
	public boolean update(Customer customer) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();
		Customer cus =  em.find(Customer.class, customer.getCustomerId());
		
		if (cus == null) {
			return false;
		}else {
			em.getTransaction().begin();
			cus.setAddress(customer.getAddress());
			cus.setCustomerPassword(customer.getCustomerPassword());
			cus.setEmail(customer.getEmail());
			cus.setMobile(customer.getMobile());
			em.getTransaction().commit();
			em.close();
			
		}	
		return true;
		
	}

	@Override
	public boolean delete(int id) {
		EntityManager em = EMUtils.getEntityManager();
		Customer cus =  em.find(Customer.class, id);
		
		if (cus == null) {
			return false;
		}else {
			String sql = "DELETE FROM Customer e WHERE e.id = :id";
			em.getTransaction().begin();
			em.createQuery(sql).setParameter("id", id).executeUpdate();
			em.getTransaction().commit();
			em.close();
			return true;
		}
		
	}

	

	

}
