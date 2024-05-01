package com.hms.ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class HmsServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("In Service");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h2><b>Hello World!</b></h2>");
	}

}
