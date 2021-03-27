package com.usa.dao;

import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JpaDao<E> {

	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("UsaSports");
	}
	
	
	public E create(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin(); 
		entityManager.persist(entity);
		entityManager.flush(); 
		entityManager.refresh(entity); 
		entityManager.getTransaction().commit();
		entityManager.close(); 
		return entity;
	}
	
	
	
	
}
