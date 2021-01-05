package g44422.webg5.Pae.api;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import g44422.webg5.Pae.interfaces.CourseDB;
import g44422.webg5.Pae.model.Course;

@RestController
@RequestMapping(path="/api", produces = "application/json")
public class JSONCourseController {

	@Autowired
	private CourseDB courses;
	
	@GetMapping("/courses")
	public Collection<Course> courses() {
		return StreamSupport.stream(courses.findAll().spliterator(), false).collect(Collectors.toList());
	}

}
