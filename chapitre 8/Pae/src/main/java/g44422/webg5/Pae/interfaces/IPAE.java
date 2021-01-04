package g44422.webg5.Pae.interfaces;

import java.util.Collection;

import org.springframework.stereotype.Service;

import g44422.webg5.Pae.model.Course;

@Service
public interface IPAE {
	public Collection<Course> getCourses();
}
