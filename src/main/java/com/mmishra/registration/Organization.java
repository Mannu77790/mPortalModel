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
@Table(name="MM_Organization")
public class Organization extends CommonBean {
	@Id
	@Column(name="MM_Organization_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_organization_seq",sequenceName="mm_organization_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_organization_seq")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Description")
	private String description;
	
	
}
