package com.musicdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicdb.model.Song;

@Repository("songRepository")
public interface SongRepositary extends JpaRepository<Song, Long> {

}
