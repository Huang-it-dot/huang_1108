package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.form.PersonForm;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

import jakarta.validation.Valid;



@Controller
public class DemoController  {	
	
	private UserMapper map;
	
	
	public  DemoController (UserMapper map){
		
		this.map = map;
		
	}
	
	
	
	
	@GetMapping("/")
	public String showForm(PersonForm personForm,Model model) {
		User user = map.selectUser("111");
		
		
		model.addAttribute("userid","ss");
		
		
		
		
		
		return "form";
	}
	
	@GetMapping("/results")
	public String showForm2() {
		
		
		
		return "results2";
	}
	
	@PostMapping("/")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "form";
		}

		return "redirect:/results";
		//return "/results";
	}
	
}
