package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServletUsingGeneriClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing second servlet with Generic class");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Welcome to second servlet</h1>");
	}

}
