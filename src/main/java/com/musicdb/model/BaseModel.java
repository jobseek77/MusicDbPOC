package com.musicdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Embeddable 
public class BaseModel {
	
	@Column(name="id")
	private long id;
	private Date createDt;
	private Date lastModified;
	
	 @OneToMany(cascade= CascadeType.ALL, mappedBy = "artist")
	 private List<Artist> artist;


	 @OneToMany(cascade= CascadeType.ALL, mappedBy = "album")
	private List<Album> album;
	
	 @OneToMany(cascade= CascadeType.ALL, mappedBy = "song")
	private List<Song> song;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public List<Artist> getArtist() {
		return artist;
	}

	public void setArtist(List<Artist> artist) {
		if (artist == null) {
			artist = new ArrayList<>();
        }
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		if (album == null) {
			album = new ArrayList<>();
        }
	}

	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		if (song == null) {
			song = new ArrayList<>();
        }
	}
	
		

}
