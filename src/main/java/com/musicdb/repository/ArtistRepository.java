package com.musicdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicdb.model.Artist;


@Repository("artistRepository")
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
