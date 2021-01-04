package webg5.rest;

import javax.websocket.server.PathParam;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Rest_Controller {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "Inconnu") String name) {
		return String.format("Hello, %s!", name);
	}
	
	@GetMapping("/hello/{name}")
	public String hello2(@PathVariable("name") String name) {
		return String.format("Hello2, %s!", name);
	}

	@PostMapping("/hello")
	public String helloPost(String name) {
		return String.format("HelloPost, %s", name);
	}

}
