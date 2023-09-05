package durgesh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFGenericServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>My second Generic Servlet</h1>");
	}

}
