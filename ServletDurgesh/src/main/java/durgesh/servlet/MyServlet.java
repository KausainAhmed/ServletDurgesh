package durgesh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class MyServlet implements Servlet{
ServletConfig config;

	@Override
	public void destroy() {
System.out.println("Going to destroy...");		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "this servlet is created by Kausain";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Creating Object...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
System.out.println("Servicing...");	
//set content type of response 
resp.setContentType("text/html");
PrintWriter out = resp.getWriter();
out.println("<h1>This is output from servlet method</h1>");
out.println("<h1>Today's date and time is:"+new Date().toString()+"</h1>");
	}

}
