package g44422.webg5.Pae.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import g44422.webg5.Pae.model.Course;

@Service
public interface CourseDB extends CrudRepository<Course, String> {
}
