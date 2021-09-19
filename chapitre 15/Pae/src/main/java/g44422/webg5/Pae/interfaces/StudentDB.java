package g44422.webg5.Pae.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import g44422.webg5.Pae.model.Course;
import g44422.webg5.Pae.model.Student;

@Service
public interface StudentDB extends CrudRepository<Student, String> {
}
