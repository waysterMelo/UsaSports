package com.usa.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usa.dao.AdminDao;

import usasports.com.entity.FavoriteLeagues;

public class AdminService {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private AdminDao adminDao;
	
	
	public AdminService(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
		adminDao = new AdminDao();
	}

	
	public void list_sports(String msg) throws ServletException, IOException {
		List<FavoriteLeagues> lista = adminDao.listAll();
		request.setAttribute("listaAll", lista);
		request.setAttribute("message", msg);
		
		String path = "admin/admin_top_sports.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		 dispatcher.forward(request, response); 
	}
}
