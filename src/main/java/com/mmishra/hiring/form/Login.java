/**
 * 
 */
package com.mmishra.hiring.form;

import javax.validation.constraints.Size;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
public class Login {
	@Size(min=6, max=30) 
	private String username;
	
	@Size(min=6, max=14) 
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
}
