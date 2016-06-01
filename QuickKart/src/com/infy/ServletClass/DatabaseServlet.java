package com.infy.ServletClass;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseServlet
 */
@WebServlet("/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DatabaseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
		final String url="jdbc:mysql://localhost/TEST";
		final String username="acp_user";
		String password="P9SyEqfT3crRahXx";
		Connection con;
		Statement stmt;
		ResultSet rs;
		String message;


		try {
			Class.forName(JDBC_DRIVER);
			con= DriverManager.getConnection(url,username,password);

			stmt=con.createStatement();
			String sql="Select * from UserDetails where username="+request.getParameter(username)+" and password="+request.getParameter(password)+"";
			rs=stmt.executeQuery(sql);
			if(rs!=null){
				message="Welcome to QUICK KART "+request.getParameter(username)+"!!!!! Happy Shopping!!!!!";
			}
			else{
				message= "OOPS!!! Invalid username and password!!!";
			}

			request.setAttribute("msg", message);
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);

		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
