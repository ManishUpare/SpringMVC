package com.BikkadIT.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("Welcome Controller Class");
	}

	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		
		String msg = "I am Manish...I Am From Warora";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESS", msg);
		mav.setViewName("welcome");

		return mav;

	}

}
