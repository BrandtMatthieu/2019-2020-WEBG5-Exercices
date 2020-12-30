package webg5.spring.hello;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class WelcomeControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcomePage() throws Exception {
		mockMvc
			.perform(get("/welcome?name=44422"))
			.andExpect(status().isOk())
			.andExpect(view().name("welcome"))
			.andExpect(content().string(Matchers.containsStringIgnoringCase("44422")));
	}
}
