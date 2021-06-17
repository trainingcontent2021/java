package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//We are storing the name of the user in a hidden textfield and getting that value from another servlet.
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        //creating form that have invisible textfield  
	        out.print("<form action='second'>");  
	        //This is a hidden field
	        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
	        out.close();  
	  
	                }catch(Exception e){System.out.println(e);}  
	   	}

}
