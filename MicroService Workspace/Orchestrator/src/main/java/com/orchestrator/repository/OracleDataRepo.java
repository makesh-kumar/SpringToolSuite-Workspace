package com.orchestrator.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.orchestrator.model.OracleData;


@Repository
public interface OracleDataRepo extends MongoRepository<OracleData, String>
{
	List<OracleData> findByTicNo(String ticNo);
}
