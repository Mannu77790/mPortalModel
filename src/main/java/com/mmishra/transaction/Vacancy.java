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
@Table(name="MM_Vacancy")
public class Vacancy {
	@Id
	@Column(name="MM_Vacancy_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_vacancy_seq",sequenceName="mm_vacancy_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_vacancy_seq")
	private Integer id;
	
	//Interview Location
	private String interview_state;
	private String interviewcity;
	private String otherInterviewLocation;
	
	//Job Location
	private String job_state;
	private String job_city;
	private String otherJobLocation;
	
	private String description;
	private String venue;
	
	private String noOfVacancy;
	private String totalExp;
	private String relevantExp;
	
	private String designation;
	
	private String primarySkill;
	private String secondarySkill;
	
	private String startDate;
	private String endDate;
	
	private String attachedJD;
	
	
	
	
	

}
