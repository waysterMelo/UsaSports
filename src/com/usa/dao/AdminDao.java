package com.usa.dao;

import java.util.List;

import usasports.com.entity.FavoriteLeagues;

public class AdminDao  extends JpaDao<FavoriteLeagues> implements GenericDao<FavoriteLeagues>{

	@Override
	public FavoriteLeagues create(FavoriteLeagues entity) {
		return super.create(entity);
	}
	
	@Override
	public List<FavoriteLeagues> listAll() {
		return super.findWithNamedQuery("FavoriteLeagues.listAll");
	}

	@Override
	public void remove(Object id) {
		
		
	}

	@Override
	public Object get(Object id) {
		
		return null;
	}

	@Override
	public long count() {
		
		return 0;
	}

}
