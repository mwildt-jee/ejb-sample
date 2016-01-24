package de.hsw.sample.ejb.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.ejb.Stateless;

@Stateless
public class PasswordUtil {
	
	/**
	 * Note: this is using an md5-algoithim and is therefore unsecure
	 * @param username
	 * @param password
	 * @return
	 * @throws  
	 */
	public String encode(String username, String password){
		StringBuilder sb = new StringBuilder();
		sb.append(username);
		sb.append(password);
		try {
			return new String(MessageDigest.getInstance("MD5").digest(sb.toString().getBytes()));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
