package com.ashlesh.springmysqlapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String first_name;
	private String last_name;
	
	public Patient() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
}
