package com.varun.ms;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TVRepository extends JpaRepository<TV, Integer> {
	
	@Query(value="select * from tv where price>?1 and price<?2", nativeQuery = true)
	List<TV> getTvByPriceRange(int from, int to);
}
		