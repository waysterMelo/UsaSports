package com.usa.admin.servlets.leagues;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usa.service.AdminService;


@WebServlet("/admin/saveFL")
@MultipartConfig(
			fileSizeThreshold = 1024 * 10,
			maxFileSize = 1024 * 300,
			maxRequestSize = 1024  * 1024
		)
public class FlSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FlSaveServlet() {
        super();
        
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService service = new AdminService(request, response);
		service.listFormAddFL(); 
		
	}

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
    	
    	AdminService service = new AdminService(req, resp);
    	service.saveFl(); 
    	
    };
}
