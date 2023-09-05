package durgesh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HTTPServletDemo extends HttpServlet{
	private static final long serialVersionUID = 1L;
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("this is get method");
	
	resp.setContentType("text/html");
	
	PrintWriter out = resp.getWriter();
	out.println("<h1>This is my HTTPServelet</h1>");
}
}
