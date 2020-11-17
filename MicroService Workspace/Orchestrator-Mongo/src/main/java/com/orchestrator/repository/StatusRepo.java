package com.orchestrator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orchestrator.model.Status;

public interface StatusRepo extends MongoRepository<Status, Integer>
{
//	boolean existByemail(String ticNo);
	
	Status findByTicNo(String ticNo);
}
