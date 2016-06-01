package com.infy.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumberCalculation
 */
public class PrimeNumberCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeNumberCalculation() {
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

		String number=request.getParameter("number");
		int n=Integer.parseInt(number);
		int counter=0;
		//boolean isPrime=false;
		String message;

		ArrayList<Integer> ar= new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

		n=n+1;

		do{
			for(int i=2;i<=n;i++){
				if(n%i==0){
					//isPrime=false;
				}
				else
				{

					ar.add(n);
					counter++;
				}

			}
			n++;
		}while(counter<5);

		for(int i:ar){
			sb.append(String.valueOf(i));
			}
		message= sb.toString();
		
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
	}

}
