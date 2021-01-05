package webg5.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import webg5.jpa.interfaces.UserDB;

@Slf4j
@Component
public class Hello implements CommandLineRunner {

	@Autowired
	private UserDB userDB;
	
	@Override
	public void run(String ...args) {
		log.info(userDB.findAll().toString());
	}

}
