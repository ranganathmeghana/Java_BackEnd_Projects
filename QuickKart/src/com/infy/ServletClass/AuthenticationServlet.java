package com.infy.ServletClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.println(request.getParameter("username"));
		//System.out.println(request.getParameter("password"));
		String message;
		
		if(request.getParameter("username").equalsIgnoreCase("meghana")&& request.getParameter("password").equalsIgnoreCase("ranganath")){
			message="Welcome to QuickKart!!! Happy Shopping!!! ";
		}
		else
		{
			message="OOPS! Invalid username and password!";
		}
		
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
		
		
//		 PrintWriter out = response.getWriter();
//	        Date date = new Date();
//	      out.println("<html>" + "<body>"+"<h2>"+request.getParameter("username")+"</h2><br/><h3> Today's date is="+date +"</h3>"+ "</body>"+"</html>");
	}

}
