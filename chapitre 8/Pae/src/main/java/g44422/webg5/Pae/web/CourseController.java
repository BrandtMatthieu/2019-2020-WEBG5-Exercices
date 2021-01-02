package g44422.webg5.Pae.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import g44422.webg5.Pae.business.PAE;

@Controller
public class CourseController {
	@GetMapping("/courses")
	public String courses(Model model) {
		model.addAttribute("courses", new PAE().getCourses());
		return "courses";
	}
}
