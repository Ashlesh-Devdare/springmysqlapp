package com.ashlesh.springmysqlapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String first_name;
	private String last_name;
	private String department;
	private String email;
	
	public Doctor() {}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", department="
				+ department + ", email=" + email + "]";
	}
	
}
