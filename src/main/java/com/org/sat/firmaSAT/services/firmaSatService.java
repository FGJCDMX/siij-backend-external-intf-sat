package com.org.sat.firmaSAT.services;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.sat.firmaSAT.repositories.firmaSatRepository;
import com.org.sat.firmaSAT.models.firmaSatModel;

@Service
public class firmaSatService {

	@Autowired
	firmaSatRepository firmaSatRepository;

	public ArrayList<firmaSatModel> obtenerFirmaSat(){
		return (ArrayList<firmaSatModel>) firmaSatRepository.findAll();
	}
	public firmaSatModel guardarFirmaSat(firmaSatModel firma) {
	 return firmaSatRepository.save(firma);	
		
	}
	
}
