package com.abcd.efg.components;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requests")
public class RequestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);
	private RequestRepository requestRepository;
	
	@Autowired
	public RequestController (RequestRepository requestRepository)
	{
		this.requestRepository = requestRepository;
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String requests(Locale locale, Model model) 
	{
		logger.info("Locale logging for curiosity", locale);
		
		model.addAttribute(requestRepository.findRequests("Request1"));
		return "requests";
	}
}
