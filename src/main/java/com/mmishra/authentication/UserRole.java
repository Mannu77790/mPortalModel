/**
 * 
 */
package com.mmishra.authentication;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
public class UserRole {
	@Id
	@Column(name="MM_User_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_user_seq",sequenceName="mm_user_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_user_seq")
	private Integer id;
	
	private String userID;
	private String roleID;
}
