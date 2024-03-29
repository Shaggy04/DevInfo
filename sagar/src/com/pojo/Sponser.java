package com.pojo;
// Generated 8 Aug, 2018 7:00:59 AM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Sponser generated by hbm2java
 */
public class Sponser implements java.io.Serializable {

	private Integer sid;
	private Position position;
	private String sname;
	private Set addmembers = new HashSet(0);

	public Sponser() {
	}

	public Sponser(Position position, String sname, Set addmembers) {
		this.position = position;
		this.sname = sname;
		this.addmembers = addmembers;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getAddmembers() {
		return this.addmembers;
	}

	public void setAddmembers(Set addmembers) {
		this.addmembers = addmembers;
	}

}
