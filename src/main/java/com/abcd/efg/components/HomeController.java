package com.abcd.efg.components;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//this allows component scanning
//and declares it as a bean in the application context
@Controller 
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = GET)
	public String home() {
		logger.debug("visiting home");
		return "home";
	}
}