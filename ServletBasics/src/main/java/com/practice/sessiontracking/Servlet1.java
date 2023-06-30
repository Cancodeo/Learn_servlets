package com.practice.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1> Hello "+ name+ " Welcome to first page!" );
		
		
//		1.Create a cookie for stateless
//		writer.println("<a href='servlet2'>Click here to go to second servlet<a/>");
//		Cookie c = new Cookie("user_name", name);
//		resp.addCookie(c);
	
		//2.Create url rewriting 
		//writer.println("<a href='servlet2?user="+name+"'>Click here to go to second servlet<a/>");
	
		//3.Hidden form field
//		writer.println(""
//				+"<form action='servlet2'>"
//				+"<input type='hidden' name='user' value='"+name+"'/>"
//				+"<button type='submit'>second servlet</button>"
//				+"</form>"
//				+"");
		
		//4.HttpSession
		
	
	}
	
}
