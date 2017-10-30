package com.musicdb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="album")
public class Album {
	
	@Column(name="name")
	private String name;
	@Column(name="year_released")
	private int yearReleased;
	
	/*@JoinColumn(name = "id")
    @ManyToOne(optional = false)
    private BaseModel baseModel;
	
	@OneToOne
    private Song song;
*/

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	/*	public BaseModel getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModel baseModel) {
		this.baseModel = baseModel;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
*/


}
