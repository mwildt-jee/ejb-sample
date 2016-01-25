package de.hsw.sample.ejb.core.service;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.hsw.sample.ejb.core.model.User;
import de.hsw.sample.ejb.core.util.PasswordUtil;

@Stateless
public class UserServiceHashMapImpl implements UserService {

	public Map<String, User> usersByName = new HashMap<String, User>(); 
	
	@EJB
	PasswordUtil passwordUtil;
	
	/**
	 * Die Initialisierung muss erfolgen, nachdem die Abhängigkeiten durch den Container aufgelöst wurden.
	 */
	@PostConstruct
	public void init(){
		this.createUser("admin", "password");
		this.createUser("user", "password");
	}
	
	public void createUser(String username, String password){
		String hash = passwordUtil.encode(username, password);
		usersByName.put(username, new User(username, hash));
	}
	
	@Override
	public User getByUsername(String username) {
		return usersByName.get(username);
	}

	@Override
	public boolean checkCredentials(User user, String password) {
		String hash = passwordUtil.encode(user.getUsername(), password);
		return hash.equals(user.getPassword());
	}
	

	
}
