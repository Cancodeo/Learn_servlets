package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServletUsingServletClass implements Servlet {

	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy....");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		System.out.println("Servlet Onject initalized.....");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing....");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Coming from Servlet....</h1>");
		writer.println("<h1>Today" + new Date().toString()+"</h1>");
	}

	
}
