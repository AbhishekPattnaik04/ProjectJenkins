package com.example.demo.service;

import com.example.demo.entity.Record;

public interface RecordService {

	Record addRecordsWithSongs(Record record);

	int getNumberOfSongsInAlbum(int recordId, Record record);

}
