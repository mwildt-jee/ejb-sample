package de.hsw.sample.ejb.core.service;

import javax.ejb.Remote;

import de.hsw.sample.ejb.core.model.User;

@Remote
public interface UserService {

	User getByUsername(String username);
	
	boolean checkCredentials(User user, String password);
	
}
