package com.mmishra.transaction;

import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
public class CommonBean {
	//Link Details
	@Column(name="MM_Client_ID", nullable=false)
	private Integer MM_Client_ID;
	
	@Column(name="MM_Org_ID", nullable=false)
	private Integer MM_Org_ID;
	
	//Track Modify Details
	@Column(name="CreatedBy", nullable=false)
	private String createdBy;
	
	@Column(name="UpdatedBy", nullable=false)
	private String updatedBy;
	
	//Track Modify Time Details
	@Column(name="Created", nullable=false)
	private Timestamp created;
	
	@Column(name="Updated", nullable=false)
	private Timestamp updated;
	
	//Active
	@Column(name="IsActive",nullable=false, columnDefinition="varchar(1) default 'Y'")
	private boolean isActive;
	
}
