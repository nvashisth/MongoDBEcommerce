package com.ecommerce.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import com.ecommerce.repository.NitinImageDAO;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;

public class NitinImageDAOImpl{}/* implements NitinImageDAO {

	@Autowired
	GridFsTemplate gridFsTemplate;
	
	@Override
	public String store(InputStream inputStream,
			String fileName,
			String contentType,
			DBObject metaData) {
		return this.gridFsTemplate
				.store(inputStream, fileName, contentType, metaData)
				.toString();
	}
	
	@Override
	public GridFSDBFile getById(String id) {
		return this.gridFsTemplate.
				findOne(new Query(Criteria.where("_id").is(id)));
	}
	
	@Override
	public GridFSDBFile getByFilename(String fileName) {
		return this.gridFsTemplate.
				findOne(new Query(Criteria.where("filename").is(fileName)));
	}
	
	@Override
	public GridFSDBFile retrive(String fileName) {
		return this.gridFsTemplate.
				findOne(new Query(Criteria.where("filename").is(fileName)));
	}
	
	@Override
	public List<GridFSDBFile> findAll() {
		return this.gridFsTemplate.find(null);
	}
}*/
