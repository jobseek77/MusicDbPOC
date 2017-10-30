package com.musicdb.service;

import java.util.List;

import com.musicdb.model.Artist;

public interface ArtistService {
	Artist getArtistById(long id);
	List<Artist> getAllArtists();
}
