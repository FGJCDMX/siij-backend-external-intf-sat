package com.org.sat.firmaSAT.controllers;

import java.net.ConnectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.sat.firmaSAT.services.firmaSatService;

import com.org.sat.firmaSAT.dtos.firmaSatAutenticarDTO;
import com.org.sat.firmaSAT.dtos.firmaSatModelDTO;
import com.org.sat.firmaSAT.dtos.firmaSatResponseDTO;
import com.org.sat.firmaSAT.dtos.firmaSatTokenDTO;
import com.org.sat.firmaSAT.models.firmaSatResponse;
import com.org.sat.firmaSAT.models.validaFirmaSatResponse;

@RestController
@RequestMapping("/firma")
public class firmaSatController {
	
	@Autowired
	firmaSatService firmaSatService;
	firmaSatResponse response;
	@Value("${efirma.user}")
	private String username;
	@Value("${efirma.password}")
	private String password;
	@Value("${efirma.cadena}")
	private String cadena;
	
	@GetMapping
	public String hello() {
		return "hello wolrd!!";
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/validar-firma", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public firmaSatResponse<firmaSatResponseDTO> validarFirma (@RequestBody firmaSatModelDTO input) throws ConnectException {
		String token;
		response = new firmaSatResponse<firmaSatResponseDTO>();
		firmaSatResponseDTO responseDTO = new firmaSatResponseDTO();
		firmaSatAutenticarDTO credentials = new firmaSatAutenticarDTO();
		credentials.setUsername(this.username);
		credentials.setPassword(this.password);
		
		try {
			firmaSatTokenDTO firmaToken = firmaSatService.autenticar(credentials);
			
			if(firmaToken == null || firmaToken.getCode() > 0) {
				responseDTO.setCode(1);
				responseDTO.setMessage("Ocurrió un error al generar el token de autorización, no es posible validar la firma");
				
				response.setResponse(responseDTO);
				
				return response;
			}
			
			token = firmaToken.getToken();
			input.setCadena(cadena);
			validaFirmaSatResponse firmaResponse = firmaSatService.validarFirma(token, input);
			
			if(firmaResponse.getError().getCode() != 0) {
				responseDTO.setCode(1);
				responseDTO.setMessage("Hubo un error en la validación de la firma");
				
				response.setResponse(responseDTO);
				
				return response;
			}
			
			responseDTO.setCode(firmaResponse.getError().getCode());
			responseDTO.setMessage(firmaResponse.getError().getMessage());
			
			response.setResponse(responseDTO);
		} catch (Exception  e) {
			if(e.getCause() instanceof ConnectException) {
				responseDTO.setCode(2);
				responseDTO.setMessage("Hubo un problema con la conexión al servicio de validación de la firma");
				
				response.setResponse(responseDTO);
				
				return response;
			}
			
			if(e.getClass().equals(feign.FeignException.Unauthorized.class)) {
				responseDTO.setCode(1);
				responseDTO.setMessage("Las credenciales de la interfaz de comunicación son incorrectas, verifique la configuración de la interfaz.");
				
				response.setResponse(responseDTO);
				
				return response;
			}
		}
		
		return response;		
	}
	
	/*@GetMapping()
	public firmaSatResponse<ArrayList<firmaSatModel>> ObtenerFirmaSat(){
		firmaSatResponse<ArrayList<firmaSatModel>> response = new firmaSatResponse<ArrayList<firmaSatModel>>();
		
		response.setResponse(firmaSatService.obtenerFirmaSat());
		
		return response;
	}
	
	@PostMapping()
	public  firmaSatResponse<firmaSatModel> guardarFirmaSat(@RequestBody firmaSatModel firma) {
		firmaSatResponse<firmaSatModel> response = new firmaSatResponse<firmaSatModel>();
		
		firma.setValor("true");
		response.setResponse(this.firmaSatService.guardarFirmaSat(firma));
		
	  return response;
	}*/
}
