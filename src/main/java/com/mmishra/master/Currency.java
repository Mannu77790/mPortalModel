package com.mmishra.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mmishra.transaction.CommonBean;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
@Entity
@Table(name="MM_Currency")
public class Currency extends CommonBean {
	@Id
	@Column(name="MM_Currency_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_currency_seq",sequenceName="mm_currency_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_currency_seq")
	private Integer id;
	
	@Column(name="Name", unique=true, nullable=false)
	private String name;
	
	@Column(name="Code", unique=true, nullable=false)
	private String code;
	
	@Column(name="Description")
	private String description;
	
	@Lob
	@Column(name="Icon")
	private byte[] icon;
	
	@Column(name="Symbol")
	private String symbol;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getIcon() {
		return icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
