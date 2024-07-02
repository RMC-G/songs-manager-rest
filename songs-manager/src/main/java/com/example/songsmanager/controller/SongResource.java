package com.example.songsmanager.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	public Song findSongById(@PathVariable Integer id) {
		Optional<Song> optSong = service.findById(id);
		if (optSong.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return optSong.get();
	}

	@PostMapping("/songs")
	public ResponseEntity<Object> addSong(@RequestBody Song song) {
		Integer songId = service.save(song).getId();
		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(songId).toUri();
		return ResponseEntity.created(path).build();
	}

	@PutMapping("/songs/{id}")
	public void editSong(@PathVariable Integer id, @RequestBody Song song) {
		Song songToEdit = findSongById(id);
		song.setId(songToEdit.getId());
		service.save(song);
	}

	@DeleteMapping("/songs/{id}")
	public ResponseEntity<Object> deleteSongById(@PathVariable Integer id) {
		service.deleteById(findSongById(id).getId());
		return ResponseEntity.noContent().build();
	}
}
