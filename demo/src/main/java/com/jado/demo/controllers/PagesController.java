package com.jado.demo.controllers;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {

	@GetMapping("/")
	// @ResponseBody quand on veut interpreter le text comme tel sans vue
	   //public String home(HttpServletRequest request, ModelMap modelmap) {
public String home(@RequestParam(required=false, defaultValue="Cher(e) Donateur(trice)")
		String name, ModelMap modelmap) {
		
		//un ternaire pour véfier si le paarametre a bien été passé, JEE
		
		/*String name = request.getParameter("name") != null && !request.getParameter("name").isEmpty()?
				request.getParameter("name") : "World";*/
				
				/*
				 * Pour passer un paramètre à la vue on injecte le modelmap
				 * */	
		//System.out.println("\n\n\n" + request.getParameter("name") + "\n\n\n");
	
		   //return "Hello World";//ici il va cherche une vue Hello world
			modelmap.put("name", name.toUpperCase());
			
		return "pages/home";// on cherche le vue home dans templates/pages
	   }
}
