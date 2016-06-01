package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationClass {
	
@RequestMapping(value="/welcome")
public ModelAndView displayJsp()
{
	String message="hi this message from meghana class";
	return new ModelAndView("welcome","message",message);
}

}
