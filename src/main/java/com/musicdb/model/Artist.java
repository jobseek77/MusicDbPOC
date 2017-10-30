package com.musicdb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class Artist{

	@Column(name="name")
	private String name;
	

	@JoinColumn(name = "id")
    @ManyToOne(optional = false)
    private BaseModel baseModel;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BaseModel getBaseModel() {
		return baseModel;
	}


	public void setBaseModel(BaseModel baseModel) {
		this.baseModel = baseModel;
	}

}
