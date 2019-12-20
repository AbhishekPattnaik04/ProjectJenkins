package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Songs {
	
	@Id
	private int songId;

	private String songName;
	
	@ManyToOne
	private Artist artist;
	
	@ManyToOne
	private Record record;

	public Songs(int songId, String songName, Artist artist, Record record) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.artist = artist;
		this.record = record;
	}

	public Songs() {
		super();
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	
	
	
}
