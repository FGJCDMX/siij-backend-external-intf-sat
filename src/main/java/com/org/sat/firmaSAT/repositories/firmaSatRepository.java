package com.org.sat.firmaSAT.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.sat.firmaSAT.models.firmaSatModel;

@Repository
public interface  firmaSatRepository extends CrudRepository<firmaSatModel, Long> {
	
}
