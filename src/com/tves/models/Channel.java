package com.tves.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tbl_channels")
public class Channel {
	@Id
	private String name;
	@Column(name="category")
	private String category;

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}
	public Channel(){
		
	}

	public Channel(String name) {
		super();
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
