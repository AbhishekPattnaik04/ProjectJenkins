package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArtistRepository;
import com.example.demo.repository.RecordRepository;
import com.example.demo.repository.SongsRepository;
@Service
public class SongsServiceImpl implements SongsService {
	
	@Autowired
	private SongsRepository songsRepo;
	
	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private RecordRepository recordRepo;

}
