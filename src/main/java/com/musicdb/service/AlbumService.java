package com.musicdb.service;

import java.util.List;

import com.musicdb.model.Album;

public interface AlbumService {
		Album getAlbumById(long id);
		List<Album> getAllAlbums();
	}


