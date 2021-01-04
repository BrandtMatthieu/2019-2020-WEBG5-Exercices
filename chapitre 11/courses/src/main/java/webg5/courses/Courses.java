package webg5.courses;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Courses {

	public static void main(String[] args) throws IOException {

		final String host = "localhost";
		final int port = 8080;
		final String path = "/api/courses";

		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(String.format("http://%s:%s%s", host, port, path)).openConnection();
			connection.setRequestMethod("GET");
			ObjectMapper mapper = new ObjectMapper();
			mapper.readValue(connection.getInputStream(), new TypeReference<Collection<Course>>(){}).forEach(course -> {
				System.out.println(course);
			});

		} catch (Exception e) {
			System.out.println("Error while fetching");
		}

	}

}
