package com.jado.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class PagesController {

	   public String home() {
		   return "Hello Word";
	   }
}
