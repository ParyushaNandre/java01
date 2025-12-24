package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet

public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2> First Servlet</h2>");
		out.println("</body>");
		out.println("</html>");
		

	}
	

}
