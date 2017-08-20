package com.mmishra.transaction;

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
@Table(name="MM_Candidate")
public class Candidate {
	@Id
	@Column(name="MM_Candidate_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_candidate_seq",sequenceName="mm_candidate_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_candidate_seq")
	private Integer id;
	
	private String vacancyID;
	private String title;
	private String fName;
	private String mName;
	private String lName;
	
	private String mobileNo;
	private String email;
	private String dateOfBirth;
	
	private String uploadResume;
	
	private String reviewerSuggestionID;
	
}
