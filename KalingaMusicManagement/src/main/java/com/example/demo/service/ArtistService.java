package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Songs;

public interface ArtistService {

	List<Songs> gettingSongs(int songId);

}
