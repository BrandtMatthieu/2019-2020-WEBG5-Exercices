package g44422.webg5.Pae.web;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import g44422.webg5.Pae.interfaces.CourseDB;
import g44422.webg5.Pae.model.Course;

@Controller
public class CourseController {

	@Autowired
	private CourseDB courses;

	@GetMapping("/courses")
	public String getCourses(Model model) {
		model.addAttribute("courses", StreamSupport.stream(courses.findAll().spliterator(), false).collect(Collectors.toList()));
		model.addAttribute("course", new Course("", "", 0));
		return "courses";
	}

	@PostMapping("/courses")
	public String addCourse(Model model, @Valid Course course, Errors errors) {
		if(errors.hasErrors()) {
			model.addAttribute("courses", StreamSupport.stream(courses.findAll().spliterator(), false).collect(Collectors.toList()));
			model.addAttribute("course", course);
			return "courses";
		} else {
			final Logger log = LoggerFactory.getLogger(CourseController.class);
			courses.save(course);
			log.info("Added new course");
			log.info(course.toString());
		}
		return "redirect:/courses";
	}
}
