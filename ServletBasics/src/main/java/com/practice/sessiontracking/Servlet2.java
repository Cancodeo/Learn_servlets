package com.practice.sessiontracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		Stateless problem / session management
//		String name = request.getParameter("name");

		PrintWriter writer = response.getWriter();
		
		//1. get all Cookies
		
//		Cookie[] cookies = request.getCookies();
//		boolean flag = false;
//		if(cookies == null) {
//			writer.println("<h1>This is a new request, go to home to enter name</h1>");
//		}else {
//			for(Cookie c : cookies) {
//				if(c.getName().equals("user_name")) {
//					String name = c.getValue();
//					writer.println("<h1> Hello "+ name+ " Welcome back" );
//					flag = true;
//					break;
//				}
//			}
//		}
		
//		2.Url-rewriting, Hidden form fields
		String name = request.getParameter("user");
		writer.println("<h1> Hello "+ name+ " Welcome back" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
