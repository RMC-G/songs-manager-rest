package com.example.songsmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.songsmanager.model.Song;
import com.example.songsmanager.service.SongService;

@RestController
public class SongResource {

	private SongService service;

	public SongResource(SongService service) {
		super();
		this.service = service;
	}

	@GetMapping("/songs")
	public List<Song> getAllSongs() {
		return service.findAll();
	}

	@GetMapping("/songs/{id}")
	public Song getSongById(@PathVariable String id) {
		Optional<Song> optSong = service.findById(Integer.valueOf(id));
		if (optSong.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return optSong.get();
	}

}
