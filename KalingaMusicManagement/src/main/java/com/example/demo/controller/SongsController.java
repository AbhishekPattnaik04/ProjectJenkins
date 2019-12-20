package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ArtistService;
import com.example.demo.service.RecordService;
import com.example.demo.service.SongsService;
@RestController
public class SongsController {
	
	@Autowired
	private SongsService songsService;
	
	@Autowired
	private RecordService recordService;
	
	@Autowired
	private ArtistService artistService;

}
