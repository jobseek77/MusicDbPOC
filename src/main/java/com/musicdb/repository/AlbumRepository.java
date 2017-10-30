package com.musicdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicdb.model.Album;

@Repository("albumRepository")
public interface AlbumRepository extends JpaRepository<Album, Long> {

}

