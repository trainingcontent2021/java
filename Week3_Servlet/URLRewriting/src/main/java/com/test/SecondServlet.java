package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	{
    try{  

    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    //getting value from the query string  
    String n=request.getParameter("uname");  
    out.print("Hello "+n);  

    out.close();  

            }catch(Exception e){System.out.println(e);}  
}  



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
