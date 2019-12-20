package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Artist;
import com.example.demo.entity.Songs;
import com.example.demo.repository.ArtistRepository;
import com.example.demo.repository.RecordRepository;
import com.example.demo.repository.SongsRepository;
@Service
public class ArtistServiceImpl implements ArtistService{

	@Autowired
	private SongsRepository songsRepo;
	
	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private RecordRepository recordRepo;

	@Override
	public List<Songs> gettingSongs(int songId){
		List<Songs> song =new ArrayList<Songs>();
		Artist artist =new Artist();
		List<Songs> song1=songsRepo.findAll();
		for(Songs song2 : song1) {
			if(song2.getSongId()==songId)
				artist=song2.getArtist();
		}
		song=artist.getSongs();
		return song;
	}
}
