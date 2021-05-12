package com.usa.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

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

	
	public void listFavoriteSports(String msg) throws ServletException, IOException {
		List<FavoriteLeagues> lista = adminDao.listAll();
		request.setAttribute("listaAll", lista);
		request.setAttribute("message", msg);
		
		String path = "admin_top_sports.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		 dispatcher.forward(request, response); 
	}
	
	
	public void listFormAddFL() throws ServletException, IOException {
		String path = "addFL.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response); 
	}

	
	public void readFiles(FavoriteLeagues fl) throws IOException, ServletException {
		String league = request.getParameter("league");
		fl.setLeague(league); 
		
		Part p = request.getPart("image");
		if (p != null && p.getSize() > 0) {
			long size = p.getSize();
			byte[] img = new byte[(int) size];
			
			InputStream in = p.getInputStream();
			in.read(img);
			in.close(); 
			fl.setImage(img); 
			
		}
	}

	public void saveFl() throws IOException, ServletException {
		FavoriteLeagues fl = new FavoriteLeagues();
		readFiles(fl);
	
		String name = request.getParameter("league");
		String img = request.getParameter("image");
		
		System.out.println(name + " a imagem é : " + img);
		
//		FavoriteLeagues saveEntity  = adminDao.create(fl);
//		if (saveEntity.getId() > 0) {
//			 String msg = "A sport was successfully saved";
//			 listFavoriteSports(msg); 
//		}
		
	}
}
