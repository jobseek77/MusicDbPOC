package com.musicdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.musicdb.model.Album;
import com.musicdb.model.Artist;
import com.musicdb.model.Song;
import com.musicdb.service.AlbumService;
import com.musicdb.service.ArtistService;
import com.musicdb.service.SongService;



@RestController
public class MusicDbController {
	
	@Autowired
	private ArtistService artistService;
	
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	private SongService songService;
	
    @RequestMapping(value = "/artist", method = RequestMethod.GET)
    public List<Artist> getArtists() {
		return artistService.getAllArtists();
	}

    @RequestMapping(value = "/artist/{id}", method = RequestMethod.GET)
    public Artist getArtist(@PathVariable("id") long id) {
		return artistService.getArtistById(id);
	}
    
    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public List<Album> getAlbums() {
		return albumService.getAllAlbums();
	}

    @RequestMapping(value = "/album/{id}", method = RequestMethod.GET)
    public Album getAlbum(@PathVariable("id") long id) {
		return albumService.getAlbumById(id);
	}
    
    @RequestMapping(value = "/song", method = RequestMethod.GET)
    public List<Song> getSongs() {
		return songService.getAllSongs();
	}

    @RequestMapping(value = "/song/{id}", method = RequestMethod.GET)
    public Song getSong(@PathVariable("id") long id) {
		return songService.getSongById(id);
	}
}


