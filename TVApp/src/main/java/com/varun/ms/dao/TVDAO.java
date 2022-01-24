package com.varun.ms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.varun.ms.TV;
import com.varun.ms.TVRepository;

@Repository
public class TVDAO {
	
	@Autowired
	TVRepository tvrepo;
	
	public List<TV> getAllTV(){		
		return tvrepo.findAll();
	}

}
