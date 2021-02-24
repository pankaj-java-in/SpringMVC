package com.spring.mvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class DataController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "Sign up for login");
		m.addAttribute("Desc", "Home for programmer...");
		System.out.println("common data....");
	}
	
	@RequestMapping("/contact")
	public String contactForm() {
		return "contact";
	}
	
	@RequestMapping(path="/success", method=RequestMethod.POST)
	public String getContactForm(@ModelAttribute User user, Model mm) {
		System.out.println("Form data Bind....");
		if(user.getUsername().isEmpty()) {
			return "redirect:/contact";
		}
		
		int id = userService.createUser(user);
		mm.addAttribute("msg", "User created with id : " +id);
		return "success";
	}
	
	
//	@RequestMapping(path="/success", method=RequestMethod.POST)
//	public String getContactForm(
//		@RequestParam(name="email", required=false) String email, 
//		@RequestParam("username") String username, 
//		@RequestParam("password") String password, Model model) {
//		
//		model.addAttribute("email", email);
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		
//		
//		User user = new User();
//		user.setUsername(username);
//		user.setEmail(email);
//		user.setPassword(password);
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
	
	
	
	@RequestMapping("/one")
	public String one() {
		return"redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		return"contact";
	}
	
	
	
	
	
	
	
	
	
	
}
