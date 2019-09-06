package com.twitter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.entity.TwitterEmployee;
import com.twitter.service.TwitterService;
import com.twitter.service.TwitterServiceInterface;

/**
 * Servlet implementation class GlobalServlet
 */
public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		String s=request.getParameter("ac");
		if(s.equals("register"))
		{
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
			TwitterEmployee te=new TwitterEmployee();
			te.setName(name);
			te.setPass(password);
			TwitterServiceInterface ts=TwitterService.CreateServiceObject();
			int i=ts.CreateProfile(te);
			if(i>0)
			{
				out.println("profile created");
			}
			else
			{
				out.println("profile not created");
				
				
			}
			
		}
		
				
	}

}
