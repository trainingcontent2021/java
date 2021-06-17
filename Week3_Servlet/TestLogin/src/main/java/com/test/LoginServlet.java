package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	         
	    String user=request.getParameter("username");  
	    String pass =request.getParameter("userpass");
	    // out.print("Welcome "+user +" Your password is : "+pass);  
	    
	    if(user.equals("cts") && (pass.equals("pass")))
	    {
	    	  RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
	    	  rd.forward(request,response);
	    }
	    else
	 	    {
	 	    	out.print("Sorry username or password error");  
	 	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	 	        rd.include(request,response);
	 	        //response.sendRedirect("http://www.google.com");  
	 	    }  
	    /*ServletConfig config=getServletConfig();   
	    String username=config.getInitParameter("myuser");  
	    String password=config.getInitParameter("mypass"); 
	    System.out.println("username "+ username + "password :"+password);*/
	    
	 /*   if(user.equals(username) && (password.equals(password)))
	    {     RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
	    	  rd.forward(request,response);
	    }
	    else
	    {
	    	out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	        rd.include(request,response);
	        //response.sendRedirect("http://www.google.com");  
	    }*/
	          
	    out.close();  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
