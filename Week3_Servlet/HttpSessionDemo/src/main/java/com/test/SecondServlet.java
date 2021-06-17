package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SecondServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		 try{  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter(); 
			    
			    //getting value from the query string  
		       // String n=request.getParameter("uname");  
			    HttpSession session=request.getSession(false);  
		        String n=(String)session.getAttribute("uname");  
		        out.print("Hello "+n);  
		        		        
				/*
				 * Cookie ck[]=request.getCookies(); out.print("Hello "+ck[0].getValue());
				 * out.close();
				 */
			  
		      
			         }catch(Exception e){System.out.println(e);}  
			    }  
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	}


