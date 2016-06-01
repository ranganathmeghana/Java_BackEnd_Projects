package com.infy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimeController {

	@RequestMapping("/prime")
	@ResponseBody
	public String getPrime() {
		return "123";
	}
	
	@RequestMapping("/home")
	public ModelAndView getIndex() {
		return new ModelAndView("home");
	}
	
}
