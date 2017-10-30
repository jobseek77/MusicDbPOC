package com.musicdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicdb.model.Song;
import com.musicdb.repository.SongRepositary;

@Service("songService")
public class SongServiceImpl implements SongService {

	@Autowired
	SongRepositary songRepository;

	@Override
	public Song getSongById(long id) {
		// TODO Auto-generated method stub
		return songRepository.getOne(id);
	}

	@Override
	public List<Song> getAllSongs() {
		// TODO Auto-generated method stub
		return songRepository.findAll();
	}

	
}


