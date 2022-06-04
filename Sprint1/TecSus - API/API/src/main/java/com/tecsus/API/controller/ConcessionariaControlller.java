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

import com.tecsus.API.entities.Concessionaria;

import com.tecsus.API.repository.ConcessionariaRepository;


@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class ConcessionariaControlller {


	@Autowired 
	ConcessionariaRepository concessionariaRepository;
	
	@GetMapping("/concessionarias") // metodo GET
	public List<Concessionaria> getConcessonaria(){
		return concessionariaRepository.findAll();
	}
	
	@GetMapping("/concessionaria/{cnpj}") // metodo GET
	public  Concessionaria getConcessionariasId(@PathVariable(value = "cnpj") int cnpj){
		return concessionariaRepository.findById(cnpj);
	}
	
	@PostMapping("/concessionaria")
	public  Concessionaria createContrato(@RequestBody Concessionaria concessionaria) {
		return concessionariaRepository.save(concessionaria);
	}
	
	@PutMapping("/concessionaria")
	public  Concessionaria atualizarContrato(@RequestBody Concessionaria concessionaria) {
		return concessionariaRepository.save(concessionaria);
	}
	
	@DeleteMapping("/concessionaria")
	public  void deleteConcessionaria(@RequestBody Concessionaria concessionaria) {
		concessionariaRepository.delete(concessionaria);
	}
	
}
