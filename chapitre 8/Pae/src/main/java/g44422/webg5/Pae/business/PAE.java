package g44422.webg5.Pae.business;

import java.util.Arrays;
import java.util.Collection;

import g44422.webg5.Pae.model.Course;
import lombok.Value;
import g44422.webg5.Pae.interfaces.IPAE;

@Value
public class PAE implements IPAE {
	public Collection<Course> getCourses() {
		return Arrays.asList(
			new Course("INT1", "Introductions", 10),
			new Course("MAT1", "Mathématiques I", 3),
			new Course("CAI1", "Anglais I", 2),
			new Course("DEV1", "Développement I", 10),
			new Course("DEV2", "Développement II", 10),
			new Course("WEBG2", "Développement web I", 5)
		);
		/* return Arrays.asList(); */
	}
}
