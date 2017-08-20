package com.mmishra.authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mmishra.transaction.CommonBean;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
@Entity
@Table(name="MM_User")
public class User extends CommonBean {
	@Id
	@Column(name="MM_User_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_user_seq",sequenceName="mm_user_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_user_seq")
	private Integer id;
	
	private String username;
	private String password;
	private String name;
	private String dateOFBirth;
	private String email;
	private String mobileNo;
	private String empCode;
}
