package webg5.jpa.interfaces;

import org.springframework.data.repository.CrudRepository;

import webg5.jpa.model.User;

public interface UserDB extends CrudRepository<User, String> {
	
}
