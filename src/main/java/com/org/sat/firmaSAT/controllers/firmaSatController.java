package com.org.sat.firmaSAT.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.sat.firmaSAT.services.firmaSatService;
import com.org.sat.firmaSAT.models.firmaSatModel;

@RestController
@RequestMapping("/firma")
public class firmaSatController {
	
	@Autowired
	firmaSatService firmaSatService;
	
	@GetMapping()
	public ArrayList<firmaSatModel> ObtenerFirmaSat(){
		return firmaSatService.obtenerFirmaSat();
		
	}
	
	@PostMapping()
	public  firmaSatModel guardarFirmaSat(@RequestBody firmaSatModel firma) {
		firma.setValor("true");
	  return this.firmaSatService.guardarFirmaSat(firma);
	}
	
	
}
