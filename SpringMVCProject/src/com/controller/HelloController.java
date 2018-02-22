package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//BY extending  a basic controller class
public class HelloController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse reponse) throws Exception{
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage","Hi user,welcome to spring mvc");
		
		return model;
		
	}

}
