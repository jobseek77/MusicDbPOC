package com.musicdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicdb.model.Album;
import com.musicdb.repository.AlbumRepository;

@Service("albumService")
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	AlbumRepository albumRepository;

	@Override
	public Album getAlbumById(long id) {
		// TODO Auto-generated method stub
		return albumRepository.findOne(id);
	}

	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return albumRepository.findAll();
	} 

}
