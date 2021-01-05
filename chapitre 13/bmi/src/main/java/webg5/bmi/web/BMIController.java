package webg5.bmi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BMIController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/vue")
	public String home_vue() {
		return "home.vue";
	}

}
