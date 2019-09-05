package com.tves.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_programmes")
public class Programmes {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="pname")
	private String pname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="start_at")
	private  java.sql.Time start_at;
	@Column(name="end_at")
	private java.sql.Time end_at;
	@Column(name="channel")
	private String cname;
	@Column(name="description")
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Programmes(){}
	public Programmes(String pname, Time start_at, Time end_at, String cname) {
		super();
		this.pname = pname;
		this.start_at = start_at;
		this.end_at = end_at;
		this.cname = cname;
	}
	public java.sql.Time getStart_at() {
		return start_at;
	}
	public void setStart_at(java.sql.Time start_at) {
		this.start_at = start_at;
	}
	public java.sql.Time getEnd_at() {
		return end_at;
	}
	public void setEnd_at(java.sql.Time end_at) {
		this.end_at = end_at;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

}
