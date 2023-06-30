package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Welcome! You are Regsitered</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String condition = req.getParameter("user_condition");
		
		if(condition != null) {
			writer.println("<h1>Name-" + name + "</h1>");
			writer.println("<h1>Password-" + password + "</h1>");
			writer.println("<h1>Email-" + email+ "</h1>");
			writer.println("<h1>Gender-" + gender + "</h1>");
			writer.println("<h1>Course-" + course+ "</h1>");
			//JDBC
			//register data in DB
			//success servlet url pattern is to be included in rd
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req,resp);
		}else {
			writer.println("<h1>You have not checked Terms and Conditon</h1>");
			//RequestDispatcher 
			//need to include response of index.html
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
		}
	}
	
}
