package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String name=request.getParameter("userName");  
			    out.print("Welcome "+name);  
			  
			    Cookie ck=new Cookie("uname",name);//creating cookie object  
			    response.addCookie(ck);//adding cookie in the response  
			  
			    //creating submit button  
			    out.print("<form action='second'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");  
			          
			    out.close();  
			  
			        }catch(Exception e){System.out.println(e);}  
	}

}
