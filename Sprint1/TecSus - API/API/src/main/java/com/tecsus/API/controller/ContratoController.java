package com.tecsus.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsus.API.entities.Contrato;
import com.tecsus.API.repository.ContratoRepository;


@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class ContratoController {

	
	@Autowired 
	ContratoRepository contratoRepository;
	
	@GetMapping("/contratos") // metodo GET
	public List<Contrato> getContratos(){
		return contratoRepository.findAll();
	}
	
	@GetMapping("/contrato/{id_contrato}") // metodo GET
	public  Contrato getContratoId(@PathVariable(value = "id_contrato") long id_contrato){
		return contratoRepository.findById(id_contrato);
	}
	
	@PostMapping("/contrato")
	public  Contrato createContrato(@RequestBody Contrato contrato) {
		return contratoRepository.save(contrato);
	}
	
	@PutMapping("/contrato")
	public  Contrato atualizarContrato(@RequestBody Contrato contrato) {
		return contratoRepository.save(contrato);
	}
	
	@DeleteMapping("/contrato")
	public  void deleteContrato(@RequestBody Contrato contrato) {
		contratoRepository.delete(contrato);
	}
	
}
