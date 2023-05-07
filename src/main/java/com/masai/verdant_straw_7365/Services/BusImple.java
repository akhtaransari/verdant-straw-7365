package com.masai.verdant_straw_7365.Services;

import java.util.List;


import com.masai.verdant_straw_7365.DAOIntrafaces.BusIntraface;
import com.masai.verdant_straw_7365.DTO.Bus;
import com.masai.verdant_straw_7365.DTO.Route;
import com.masai.verdant_straw_7365.DataBase.EMUtils;

import jakarta.persistence.EntityManager;

public class BusImple implements BusIntraface{

	@Override
	public boolean addBus(Bus bus) {
		
		EntityManager em = EMUtils.getEntityManager();
		Bus busO =  em.find(Bus.class, bus.getBusid());
		
		if (busO == null) {
			return false;
		}else {
			em.getTransaction().begin();
			em.persist(busO);
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
		
		
	}

	@Override
	public boolean deleteBus(int id) {
		EntityManager em = EMUtils.getEntityManager();
		Bus bus =  em.find(Bus.class, id);
		
		
		if (bus == null) {
			return false;
		}else {
			String sql = "DELETE FROM Bus e WHERE e.id = :busid";
			em.getTransaction().begin();
			em.createQuery(sql).setParameter("busid", id).executeUpdate();
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
		
	}

	@Override
	public boolean addRoute(Route route) {
		EntityManager em = EMUtils.getEntityManager();
		Route rt =  em.find(Route.class, route.getRouteid());
		
		if (rt == null) {
			return false;
		}else {
			em.getTransaction().begin();
			em.persist(route);
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
	}

	@Override
	public boolean deleteRoute(int id) {
		EntityManager em = EMUtils.getEntityManager();
		Route rt =  em.find(Route.class, id);
		
		
		if (rt == null) {
			return false;
		}else {
			String sql = "DELETE FROM Bus e WHERE e.id = :routeid";
			em.getTransaction().begin();
			em.createQuery(sql).setParameter("routeid", id).executeUpdate();
			em.getTransaction().commit();
			em.close();
		}
		
		return true;
	}

	@Override
	public List<BusIntraface> viewBuses() {
		
		return EMUtils.getEntityManager().createQuery("SELECT e FROM Bus e").getResultList();
	}

	@Override
	public List<Route> viewRoutes() {
		// TODO Auto-generated method stub
		return EMUtils.getEntityManager().createQuery("SELECT e FROM Route e").getResultList();
	}

	

}
