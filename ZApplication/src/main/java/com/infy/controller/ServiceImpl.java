package com.infy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface
{
	public List<Integer> zcalculatePrime(int number)
	{
		System.out.println("Inside ServiceIml");
		int counter=0;
		String message;

		ArrayList<Integer> ar= new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

	


	        while (counter != 5) {
	            for (int i = number + 1;; i++) {
	                if (counter == 5) {
	                    break;
	                }
	                int countNum = 0;
	                int j = 0;

	                for (j = i - 1; j > 1; j--) {
	                    if (i % j != 0) {
	                        countNum++;
	                    }
	                    if (countNum == (i - 2)) {
	                    	ar.add(i);
	                        counter++;
	                    }

	                }
	            }
	        }
	        return ar;
	    }

		

		
//		for(int i:ar){
//			sb.append(String.valueOf(i));
//			}
//		message= sb.toString();
//		
//		request.setAttribute("msg", message);
//		request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
	}

