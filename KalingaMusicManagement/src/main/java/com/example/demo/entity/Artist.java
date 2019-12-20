package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {

	@Id
	private int artistId;
	
	private String artistName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "artist")
	private List<Songs> songs;

	public Artist(int artistId, String artistName, List<Songs> songs) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.songs = songs;
	}

	public Artist() {
		super();
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Songs> getSongs() {
		return songs;
	}

	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	
	
}
