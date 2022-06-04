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

import com.tecsus.API.entities.Conta_luz;
import com.tecsus.API.repository.Conta_luzRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class Conta_luzController {
	
	@Autowired 
	Conta_luzRepository conta_luzRepository;
	
	@GetMapping("/contas_luz") // metodo GET
	public List<Conta_luz> getContas_luz(){
		return conta_luzRepository.findAll();
	}
	
	@GetMapping("/conta_luz/{id_conta}") // metodo GET
	public  Conta_luz getConta_luzId(@PathVariable(value = "id_conta") long id_conta){
		return conta_luzRepository.findById(id_conta);
	}
	
	@PostMapping("/conta_luz")
	public  Conta_luz createConta_luz(@RequestBody Conta_luz conta_luz) {
		return conta_luzRepository.save(conta_luz);
	}
	
	@PutMapping("/conta_luz")
	public  Conta_luz atualizarConta_luz(@RequestBody Conta_luz conta_luz) {
		return conta_luzRepository.save(conta_luz);
	}
	
	@DeleteMapping("/conta_luz")
	public  void deleteConta_luz(@RequestBody Conta_luz conta_luz) {
		conta_luzRepository.delete(conta_luz);
	}

}
