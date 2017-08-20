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
@Table(name="MM_Designation_Payment")
public class DesignationPaymentMapping {
	@Id
	@Column(name="MM_Designation_Paymente_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_designation_payment_seq",sequenceName="mm_designation_payment_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_designation_payment_seq")
	private Integer id;
	
	@Column(name="From")
	private double rangeFrom;
	
	@Column(name="To")
	private double rangeTo;
	
	//One to One Mapping
	
	
	
	

}
