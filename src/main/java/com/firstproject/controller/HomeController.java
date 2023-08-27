package com.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vivek")
public class HomeController {
	
	@ResponseBody
	@GetMapping("/home")
	public String home() {
		return "<h1>vivek sharma is one of the best java developer</h1>";
	}
	
	@ResponseBody
	@GetMapping("/about")
	public String about() {
		return "<h1 style='color:red;'>vivek bhai ki jai ho</h1>";
	}
	
	@GetMapping("/first")
	public String first(Model model) {
		model.addAttribute("name","deepak sharma");
		return "first";
	}

}
