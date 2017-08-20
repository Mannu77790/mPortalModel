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
@Table(name="MM_Candidate_Query")
public class CandidateQuery {
	
	@Id
	@Column(name="MM_Candidate_Query_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_candidate_query_seq",sequenceName="mm_candidate_query_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_candidate_query_seq")
	private Integer id;
	
	private String conductInterviewResponseID;
	private String messageBy;
	private String message;
	
}
