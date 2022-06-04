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

import com.tecsus.API.entities.Unidade;
import com.tecsus.API.repository.UnidadeRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class UnidadeController {
	
	@Autowired 
	UnidadeRepository unidadeRepository;
	
	@GetMapping("/unidades") // metodo GET
	public List<Unidade> getUnidades(){
		return unidadeRepository.findAll();
	}
	
	@GetMapping("/unidade/{id}") // metodo GET
	public  Unidade getUnidadeId(@PathVariable(value = "id") long id){
		return unidadeRepository.findById(id);
	}
	
	@PostMapping("/unidade")
	public  Unidade createUnidade(@RequestBody Unidade unidade) {
		return unidadeRepository.save(unidade);
	}
	
	@PutMapping("/unidade")
	public  Unidade atualizarUnidade(@RequestBody Unidade unidade) {
		return unidadeRepository.save(unidade);
	}
	
	@DeleteMapping("/unidade")
	public  void deleteUnidade(@RequestBody Unidade unidade) {
		unidadeRepository.delete(unidade);
	}
	
	 
}
