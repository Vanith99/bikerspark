package com.varun.ms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.varun.ms.service.TVService;

@RestController
public class TVController {
	@Autowired
	TVRepository tvrepo;
	
	@Autowired
	TVService tvService;
	
	@GetMapping("/tv/")
	List<TV> getAllTV(){		
		return tvService.getAllTV();
	}
	
	@GetMapping("/tv/{id}")
	TV getTVById(@PathVariable("id") int id) {
		return tvrepo.findById(id).get();
	}
	
	@PostMapping("/tv/")
	void updateInsertTv(@RequestBody TV tv){
		tvrepo.save(tv);
	}
	
	@DeleteMapping("/tv/{id}")
	void deleteTV(@PathVariable int id) {
		tvrepo.deleteById(id);
	}
	
	@GetMapping("/tv/{from}/{to}")
	List<TV> getTvsByPriceRange(@PathVariable("from") int fromPrice, @PathVariable("to") int toPrice){
		return tvrepo.getTvByPriceRange(fromPrice, toPrice);
	}
}
