package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.apiConfig.ApiResponse;
import com.example.demo.entity.Record;
import com.example.demo.service.ArtistService;
import com.example.demo.service.RecordService;
import com.example.demo.service.SongsService;

@RestController
public class RecordController {

	@Autowired
	private SongsService songsService;
	
	@Autowired
	private RecordService recordService;
	
	@Autowired
	private ArtistService artistService;
	

	@PostMapping("/insert/album/songs")
	public ApiResponse addLibrary(@RequestBody Record record) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			
			Record record1 = recordService.addRecordsWithSongs(record);
			response.setBody(record1);
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
