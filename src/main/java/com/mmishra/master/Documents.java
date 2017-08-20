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
@Table(name="MM_Documents")
public class Documents {
	@Id
	@Column(name="MM_Documents_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_documents_seq",sequenceName="mm_documents_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_documents_seq")
	private Integer id;

	
	@Column(name="Name", unique=true, nullable=false)
	private String name;
	
	@Column(name="Code", unique=true, nullable=false)
	private String code;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Docs")
	private String attachedDocs;
}
