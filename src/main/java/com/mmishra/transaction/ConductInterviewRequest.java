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
@Table(name="MM_Conduct_Interview_Req")
public class ConductInterviewRequest {
	@Id
	@Column(name="MM_Conduct_Interview_Req_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_conduct_interview_req_seq",sequenceName="mm_conduct_interview_req_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_conduct_interview_req_seq")
	private Integer id;
	
	private String vacancyID;
	private String candidateID;
	
	private String startDate;
	private String endDate;
	
	private String interviewDate;
	private String slotTime;
	
	private String processDetails;
	
	
	

}
