package com.reg.login.app.regloginapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDetailsImpl {
	
	private UserRepository repository;
	
	@Autowired
	public UserServiceDetailsImpl(UserRepository repository) {
		this.repository=repository;
	}

	public void registerUser(UserRegDetails user) throws UserAlreadyExistsException {
		if(repository.existsUserDetailsByUsername(user.getUsername()) != 0) {
			throw new UserAlreadyExistsException("Username " + user.getUsername() + " already exists in the table");
		}
		repository.save(user);
		
		
	}

	public void loginUser(UserRegDetails user) throws InvalidUsernameUsedException, InvalidPasswordUsedException {
		if(repository.findByUsername(user.getUsername())==null) {
			throw new InvalidUsernameUsedException(user.getUsername() + " doesnt exists in the table");
			
		}
		if(repository.findByPassword(user.getPassword(),user.getUsername())==null) {
			throw new InvalidPasswordUsedException("password does not match with the username");
			
		}
		
	}

}
