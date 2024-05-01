package com.hms.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest request,HttpSession session) {
		System.out.println("Add method called");
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int result = num1+num2;
		session.setAttribute("result", result);
		return "add";
	}
	
	//Spring boot way
//	@RequestMapping("result")
//	public String result(@RequestParam("num1")int num1,@RequestParam("num2")int num2 ,HttpSession session) {
//		System.out.println("Add method called");
//		int result = num1+num2;
//		session.setAttribute("result", result);
//		return "result.jsp";
//	}
	
//	//Spring MVC way
//		@RequestMapping("result")
//		public String result(@RequestParam("num1")int num1,@RequestParam("num2")int num2 ,Model model) {
//			System.out.println("Add method called");
//			int result = num1+num2;
//			model.addAttribute("result", result);
//			return "result";
//		}
	
	//Spring MVC  modelandview way
			@RequestMapping("result")
			public ModelAndView result(@RequestParam("num1")int num1,@RequestParam("num2")int num2 ,ModelAndView mv) {
				System.out.println("Add method called");
				int result = num1+num2;
				mv.addObject("result", result);
				mv.setViewName("result");
				return mv;
			}
}
