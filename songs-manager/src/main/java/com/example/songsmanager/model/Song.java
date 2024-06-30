package com.example.songsmanager.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String artist;
	@Column
	private String album;
	@Column
	@Temporal(TemporalType.DATE)
	private LocalDate releaseDate;

	public Song() {
		super();
	}

	public Song(Integer id, String name, String artist, String album, LocalDate releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.releaseDate = releaseDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

//	@Override
//	public String toString() {
//		return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", album=" + album + ", releaseDate="
//				+ releaseDate + "]";
//	}

}
