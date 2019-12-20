package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Record;
import com.example.demo.entity.Songs;
import com.example.demo.repository.ArtistRepository;
import com.example.demo.repository.RecordRepository;
import com.example.demo.repository.SongsRepository;

@Service
public class RecordServiceImpl implements RecordService{

	
	@Autowired
	private SongsRepository songsRepo;
	
	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private RecordRepository recordRepo;

	@Override
	public Record addRecordsWithSongs(Record record) {
		List<Songs> song=record.getSongs();
		for(Songs song1 : song) {
		song1.setRecord(record);
		}
		 return recordRepo.save(record);
	}

	@Override
	public int getNumberOfSongsInAlbum(int recordId, Record record) {
		List<Record> record1 = recordRepo.findAll();
		List<Songs> song =new ArrayList<Songs>();
		int sum=0;
		for(Record record2 :record1) {
			if(record2.getRecordId()==recordId)
				song=record2.getSongs();
		}
		for(Songs song2: song) {
			sum=sum+1;
		}
		
		
		
		return sum;
	}
	
	

}
