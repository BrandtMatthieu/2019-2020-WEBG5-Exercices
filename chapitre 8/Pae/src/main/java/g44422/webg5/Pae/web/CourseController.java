package g44422.webg5.Pae.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import g44422.webg5.Pae.business.PAE;
import g44422.webg5.Pae.model.Course;

@Controller
public class CourseController {
	@GetMapping("/courses")
	public String getCourses(Model model) {
		model.addAttribute("courses", new PAE().getCourses());
		model.addAttribute("course", new Course("", "", 0));
		return "courses";
	}

	@PostMapping("/courses")
	public String addCourse(Model model, Course course) {
		final Logger log = LoggerFactory.getLogger(CourseController.class);
		log.info("Added new course");
		log.info(course.toString());
		model.addAttribute("courses", new PAE().getCourses());
		model.addAttribute("course", new Course("", "", 0));
		return "courses";
	}
}
