package com.mmishra.registration;

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
@Table(name="MM_Client")
public class Client extends CommonBean {
	@Id
	@Column(name="MM_Client_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_client_seq",sequenceName="mm_client_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_client_seq")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Description")
	private String description;
	
	
}
