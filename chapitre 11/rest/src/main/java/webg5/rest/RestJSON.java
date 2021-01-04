package webg5.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/hellojson")
public class RestJSON {
	@GetMapping
	public Info hello() {
		return new Info("Hello, World!", new Date());
	}
}
