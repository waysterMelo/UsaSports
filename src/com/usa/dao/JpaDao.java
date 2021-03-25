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
	
	public JpaDao() {
		// TODO Auto-generated constructor stub
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

	public List<E> findWithNamedQuery(String queryName){
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createNamedQuery(queryName);
		List<E> list = query.getResultList();
		entityManager.close(); 
		return list;
	}

}
