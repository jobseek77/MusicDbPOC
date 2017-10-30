package com.musicdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicdb.model.Artist;
import com.musicdb.repository.ArtistRepository;



@Service("artistService")
public class ArtistServiceImpl implements ArtistService {
	
	@Autowired
	ArtistRepository artistRepository; 

	@Override
	public Artist getArtistById(long id) {
		return artistRepository.findOne(id);
		}

	@Override
	public List<Artist> getAllArtists() {
		// TODO Auto-generated method stub
		return artistRepository.findAll();
	}

	
}
