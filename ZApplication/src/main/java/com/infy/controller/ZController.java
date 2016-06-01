package com.infy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ZController {
	

@Autowired
private ServiceInterface serviceInterface;
	
@Autowired
private ServiceImpl serviceImpl;

@RequestMapping(value = "/GetPrimeNumbers", method = RequestMethod.GET) 
//@ResponseBody 
//public ModelAndView generatePrime(HttpServletRequest request)
public 	List<Integer> generatePrime(HttpServletRequest request)
{
	String s=request.getParameter("number");
	RestTemplate restTemplate = new RestTemplate();
	String url="http://10.72.8.14:8080/primeNumbers/getPrime/5"; 
	restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	System.out.println("Before the http");
	List<Integer> users=restTemplate.getForObject(url, ArrayList.class);
	return users;

	
//	System.out.println(s);
//	List<Integer> primeList=serviceInterface.zcalculatePrime(Integer.parseInt(s));
//	for(int i:primeList){
//    System.out.println(i);
	}
	//ModelAndView model = new ModelAndView("Welcome");
//	model.addObject("plist", primeList);
//	return model;
	//return new ModelAndView("Welcome","plist", primeList);
	//return primeList;
}

	
/*	@ResponseBody 
	public final List<Integer> saveMgrTimeSheetData(@RequestParam(value="number")int number) throws Exception{
		return serviceInterface.zcalculatePrime(number);
		
	}*/
	
	/*@RequestMapping(value="/GetPrimeNumbers", method=RequestMethod.POST)
	public ModelAndView generatePrime(HttpServletRequest request, HttpServletResponse response)
	{
	String i=	request.getParameter("number");
	System.out.println(i);
	
	List<Integer> primeList=serviceInterface.zcalculatePrime(Integer.parseInt(i));
	
	
    return new ModelAndView("Welcome", "pList", primeList);
	
	}*/



//public List<Integer> generatePrimeNumbers(HttpServletRequest request) { 
//	String i = request.getParameter("number"); 
//	System.out.println(i); 
//	List<Integer> primeList=serviceInterface.zcalculatePrime(Integer.parseInt(i));	
//	for(int t:primeList)
//	{
//		System.out.println(t);
//	}
//	return primeList;
//}

