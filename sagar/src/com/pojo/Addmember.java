package com.pojo;
// Generated 8 Aug, 2018 7:00:59 AM by Hibernate Tools 3.6.0.Final

/**
 * Addmember generated by hbm2java
 */
public class Addmember implements java.io.Serializable {

	private Integer id;
	private Sponser sponser;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String mobile;
	private Integer pid;
	private String enrollmentFee;

	public Addmember() {
	}

	public Addmember(Sponser sponser, String name, String surname, String email, String password, String mobile,
			Integer pid, String enrollmentFee) {
		this.sponser = sponser;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.pid = pid;
		this.enrollmentFee = enrollmentFee;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sponser getSponser() {
		return this.sponser;
	}

	public void setSponser(Sponser sponser) {
		this.sponser = sponser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getEnrollmentFee() {
		return this.enrollmentFee;
	}

	public void setEnrollmentFee(String enrollmentFee) {
		this.enrollmentFee = enrollmentFee;
	}

}