package com.musicdb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="song")
public class Song{

	
	
	@Column(name="track")
	private int track;
	@Column(name="name")
	private String name;
	@JoinColumn(name = "id")
    @ManyToOne(optional = false)
    private BaseModel baseModel;
	@JoinColumn(name = "album_id")
	@OneToOne(optional = false)
    private Album album;

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

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
