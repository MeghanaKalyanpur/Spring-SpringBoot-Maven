package com.hms.springMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String course() {
		return "Java Spring Boot";
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}
	
//	@RequestMapping("/addPatientToDB")
//	public ModelAndView addObjectToDB(@RequestParam("id")String id,@RequestParam("name")String name, ModelAndView mv){
//		Patient patient=new Patient();
//		patient.setId(id);
//		patient.setName(name);
//		
//		System.out.println("addPatientToDB method called ");
//		mv.addObject("patient", patient);
//		mv.setViewName("result");
//		
//		return mv;		
//	}
	
	@RequestMapping("/addPatientToDB")
	public String addObjectToDB(@ModelAttribute("user1")Patient patient){
		System.out.println("addPatientToDB method called ");		
		return "result";		//means result.jsp -adds suffix from application.properties page 
	}
}
