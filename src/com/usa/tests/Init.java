package com.usa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.usa.dao.AdminDao;

public class Init {
	
	static EntityManagerFactory emf;
	static EntityManager em ;
	static AdminDao adminDao;
	


	public static void InitClass() {
		emf = Persistence.createEntityManagerFactory("UsaSports");
		em = emf.createEntityManager();
		adminDao = new AdminDao();
	}
	

	public static void EndClass() {
		em.close();
		emf.close(); 
	}
}
