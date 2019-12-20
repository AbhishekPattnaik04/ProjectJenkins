package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.apiConfig.ApiResponse;
import com.example.demo.entity.Record;
import com.example.demo.service.ArtistService;
import com.example.demo.service.RecordService;
import com.example.demo.service.SongsService;
@RestController
public class ArtistController {

	@Autowired
	private SongsService songsService;
	
	@Autowired
	private RecordService recordService;
	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping("/getSongsfromArtist/{id}")
	public ApiResponse getNumberOfSongsInAlbums(@PathVariable("id") int songId,@RequestBody Record record) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			
			int sum = recordService.getNumberOfSongsInAlbum(songId,record);
			response.setBody(sum);
			response.setError(false);
			response.setSuccess(true);
			
			
			message="Inserted Successfylly with id";
			response.setMessage(message);		
		} catch(Exception ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;

}
}
