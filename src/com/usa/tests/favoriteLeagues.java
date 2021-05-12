package com.usa.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import usasports.com.entity.FavoriteLeagues;

public class favoriteLeagues extends Init {

	
	
	
	@BeforeClass
	public static void setupBeforeClass() {
		InitClass();  
	}
	
	@Test
	public void getLeagues() {
		
		Integer id = 1;
		FavoriteLeagues favoriteLeagues = (FavoriteLeagues) adminDao.get(id);
		assertNotNull(favoriteLeagues);
		
	}


	@Test
	public void getLista() {
		List<FavoriteLeagues> lista = adminDao.listAll();
		
		for (FavoriteLeagues favoriteLeagues : lista) {
			System.out.println(favoriteLeagues.getLeague());
		}
		
		assertTrue(lista.size() > 0);
	}
	
	
	@AfterClass
	public static void setupEndClass() {
		EndClass(); 
	}

}
