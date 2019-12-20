package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Record {

	@Id
	private int recordId;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "record")
	private List<Songs> songs;

	public Record(int recordId, List<Songs> songs) {
		super();
		this.recordId = recordId;
		this.songs = songs;
	}

	public Record() {
		super();
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public List<Songs> getSongs() {
		return songs;
	}

	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	} 
	
	
}
