package com.varun.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.ms.TV;
import com.varun.ms.dao.TVDAO;

@Service
public class TVService {
	@Autowired
	TVDAO tvdao;

	public List<TV> getAllTV(){		
		return tvdao.getAllTV();
	}

}
