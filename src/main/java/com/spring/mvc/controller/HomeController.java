package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
			
		@RequestMapping("/home")
		public String home(Model model) {
			System.out.println("Under Home....");
			model.addAttribute("myName", "Pankaj Raj");
			model.addAttribute("id", 8540);
			List<String> friends = new ArrayList<String>();
			friends.add("Amit Kumar");
			friends.add("Alok Narayan");
			friends.add("Jay");
			
			model.addAttribute("friends", friends);
			return "home";
		}
		
		@RequestMapping("/about")
		public String about() {
			System.out.println("Under About....");
			return "about";
		}
		
		@RequestMapping("/help")
		public ModelAndView help() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("name", "Pankaj Raj");
			modelAndView.addObject("mobile", "8540998010");
			modelAndView.setViewName("help");
			return modelAndView;
		}
}
