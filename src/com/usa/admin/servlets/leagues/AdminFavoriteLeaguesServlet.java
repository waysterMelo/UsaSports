package com.usa.admin.servlets.leagues;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usa.service.AdminService;


@WebServlet("/admin/admin_top_sports")
public class AdminFavoriteLeaguesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AdminFavoriteLeaguesServlet() {
      
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService adminService = new AdminService(request, response);
		adminService.listFavoriteSports(null);	
	}


}
