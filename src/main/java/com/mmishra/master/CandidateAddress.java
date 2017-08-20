package com.mmishra.master;

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
@Table(name="MM_Candidate_Address")
public class CandidateAddress {
	@Id
	@Column(name="MM_Candidate_Address_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_candidate_address_seq",sequenceName="mm_candidate_address_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_candidate_address_seq")
	private Integer id;
	
	
	private String street1;
	private String street2;
	private String country;
	private String state;
	private String city;
	private String landMark;
	private String description;
	
	private String addressTypeID;
	
	
	
}
