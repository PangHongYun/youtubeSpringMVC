package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnotation {
	
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVar){
//		instead of doing this we can use map
//		@PathVariable("username") String name, 
//		@PathVariable("countryname") String country
		String country = pathVar.get("countryname");
		String name = pathVar.get("username");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "hello " +name+" you are from "+country);
		return model ;
	}

}
