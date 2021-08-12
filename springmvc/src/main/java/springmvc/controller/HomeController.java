package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//end point of url called by user also request mapping using annotation
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is the home URL");
		return "index";
	}

}
