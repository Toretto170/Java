package com.spadea.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.StandardPoors;

public interface StandardDAO extends JpaRepository<StandardPoors, Integer>{
	
	List<StandardPoors> findByGICSSector(String sector);
	
}
