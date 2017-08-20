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
@Table(name="MM_Reviewer")
public class Reviewer extends CommonBean {
	@Id
	@Column(name="MM_Reviewer_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_reviewer_seq",sequenceName="mm_reviewer_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_reviewer_seq")
	private Integer id;
	
	private String vacancyID;
	private String userID;
	
	private String startDate;
	private String endDate;
}
