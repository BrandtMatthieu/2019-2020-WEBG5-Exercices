package g44422.webg5.Pae.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(@RequestParam(defaultValue = "") String username, Model model) {
		model.addAttribute("username", username);
		return "home";
	}
}
