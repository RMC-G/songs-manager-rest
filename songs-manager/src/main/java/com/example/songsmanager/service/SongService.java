package com.example.songsmanager.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.songsmanager.model.Song;

@Service
public interface SongService extends JpaRepository<Song, Integer> {

}
