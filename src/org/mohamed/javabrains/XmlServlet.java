package org.mohamed.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("XML servlet called!");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("userName");
		String uid = request.getParameter("uId");
		out.println("Hello! from GET method " + uName + uid);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("userName");
		//String uid = request.getParameter("uId");
		out.println("Hello! from POST method " + uName);
	}


}
