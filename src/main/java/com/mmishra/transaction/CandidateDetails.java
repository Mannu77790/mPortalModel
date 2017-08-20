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
@Table(name="MM_Candidate_Details")
public class CandidateDetails {
	@Id
	@Column(name="MM_Candidate_Details_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_candidate_details_seq",sequenceName="mm_candidate_details_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_candidate_details_seq")
	private Integer id;
	private String candidateID;
	private String alternateMobileNo;
	private String alternateEmail;
	
	//Master
	private String attachedDocs;
	
	
	//Master
	private String address;
	
	private String age;
	
	private String currentSalary;
	private String expectedSalary;
	
	private String noticePeriod;
	
	private String totalExp;
	private String revelantExp;
	
	private String currentDesignation;
	private String expectedDesignation;
	
	private String gapInEducation;
	private String gapInExperience;
	
	private String primarySkill;
	private String secondarySkill;
	
	private String uploadCoverLetter;
	
	private String remarks;
}
