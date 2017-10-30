package com.musicdb.service;

import java.util.List;

import com.musicdb.model.Song;

public interface SongService {

		Song getSongById(long id);
		List<Song> getAllSongs();
	}

