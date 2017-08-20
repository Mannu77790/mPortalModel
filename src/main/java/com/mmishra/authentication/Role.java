package com.mmishra.authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
@Entity
@Table(name="MM_Role")
public class Role {
	@Id
	@Column(name="MM_Role_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_role_seq",sequenceName="mm_role_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_role_seq")
	private Integer id;
	
	private String name;
	private String description;
}
