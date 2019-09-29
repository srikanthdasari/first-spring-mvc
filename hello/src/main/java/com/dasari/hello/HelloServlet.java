package com.dasari.hello;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class HelloServlet extends HttpServlet {
    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Hello Servlet</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY>");
            out.println("Hello Servlet");
            out.println("</BODY>");
            out.println("</HTML>");
    }
}