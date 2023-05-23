package com.org.sat.firmaSAT.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.org.sat.firmaSAT.dtos.firmaSatAutenticarDTO;
import com.org.sat.firmaSAT.dtos.firmaSatModelDTO;
import com.org.sat.firmaSAT.dtos.firmaSatTokenDTO;
import com.org.sat.firmaSAT.models.validaFirmaSatResponse;

@FeignClient(name = "firmaSatServiceClient", url = "${efirma.url}")
public interface firmaSatService {

	@PostMapping(value = "/autenticar")
	public firmaSatTokenDTO autenticar(@RequestBody firmaSatAutenticarDTO input);
	
	@PostMapping(value = "/eFirma")
	public validaFirmaSatResponse validarFirma(@RequestHeader("Authorization") String token, @RequestBody firmaSatModelDTO input);
	
	/*@Autowired
	firmaSatRepository firmaSatRepository;

	public ArrayList<firmaSatModelDTO> obtenerFirmaSat(){
		return (ArrayList<firmaSatModelDTO>) firmaSatRepository.findAll();
	}
	
	public firmaSatModelDTO guardarFirmaSat(firmaSatModel firma) {
	 return firmaSatRepository.save(firma);	
		
	}*/
	
}
