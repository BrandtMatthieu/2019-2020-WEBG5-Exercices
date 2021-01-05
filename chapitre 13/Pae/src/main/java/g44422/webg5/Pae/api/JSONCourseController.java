package g44422.webg5.Pae.api;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import g44422.webg5.Pae.business.PAE;
import g44422.webg5.Pae.model.Course;

@RestController
@RequestMapping(path="/api", produces = "application/json")
public class JSONCourseController {
	
	@GetMapping("/courses")
	public Collection<Course> courses() {
		return new PAE().getCourses();
	}

}
