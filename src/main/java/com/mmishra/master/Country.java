package com.mmishra.master;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.mmishra.transaction.CommonBean;

/**
 * @author mmishra
 * Manindra Mishra
 * manindramishra.seven@gmail.com
 */
@Entity
@Table(name="MM_Country")
public class Country extends CommonBean {
	@Id
	@Column(name="MM_Country_ID", unique=true, nullable=false)
	@SequenceGenerator(name="mm_country_id_seq",sequenceName="mm_country_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mm_country_id_seq")
	private Integer id;
	
	@Column(name="Name", unique=true, nullable=false)
	private String name;
	
	@Column(name="Code", unique=true, nullable=false)
	private String code;
	
	@Column(name="Description")
	private String description;
	
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private Set<State> state;

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
	
	public Set<State> getState() {
		return state;
	}

	public void setState(Set<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", code=" + code
				+ ", description=" + description + "]";
	}
}
