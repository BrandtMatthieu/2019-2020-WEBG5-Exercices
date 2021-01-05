package g44422.webg5.Pae.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JpaCmdLineRunner implements CommandLineRunner {

	@Override
	public void run(String ...ars) {
		log.info("JpaCmdLineRunner running");
	}
	
}
