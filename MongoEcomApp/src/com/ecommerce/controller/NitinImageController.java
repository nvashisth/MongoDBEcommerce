package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.repository.NitinImageDAO;
import com.mongodb.gridfs.GridFSDBFile;

@RestController
@RequestMapping("nitinImage")
public class NitinImageController {
	
	@Autowired
	private NitinImageDAO nitinImageDAO;
	
	@RequestMapping(value = "/imageAll", method = RequestMethod.GET)
	public List<GridFSDBFile> getImageAll() {
		return nitinImageDAO.findAll();
	}
	
	@RequestMapping(value = "/image{imageName}", method = RequestMethod.GET)
	public GridFSDBFile getImage(@PathVariable("imageName")String imageName) {
		return nitinImageDAO.getByFilename(imageName);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST) 
	public String createImageWithMetaData(GridFSDBFile dbFile) {
		return nitinImageDAO.store(dbFile.getInputStream(),
				dbFile.getFilename(),
				dbFile.getContentType(),
				dbFile.getMetaData());
	}
}
