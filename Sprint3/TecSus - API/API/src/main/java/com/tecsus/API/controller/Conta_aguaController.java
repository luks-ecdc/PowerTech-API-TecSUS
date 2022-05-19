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

import com.tecsus.API.entities.Conta_agua;
import com.tecsus.API.entities.Contrato;
import com.tecsus.API.repository.Conta_aguaRepository;
import com.tecsus.API.repository.ContratoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin (origins="*")// impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class Conta_aguaController {

	
	
	
	@Autowired 
	Conta_aguaRepository conta_aguaRepository;
	
	@Autowired 
	ContratoRepository contratoRepository;
	
	@GetMapping("/Contas_agua") // metodo GET
	public List<Conta_agua> getContas_agua(){
		return conta_aguaRepository.findAll();
	}
	
	@GetMapping("/Conta_agua/{id_conta}") // metodo GET
	public  Conta_agua getConta_aguaId(@PathVariable(value = "id_conta") long id){
		return conta_aguaRepository.findById(id);
	}
	
	@GetMapping("/Conta_agua_rgi/{rgi_fk}") // metodo GET
	public  List<Conta_agua> getConta(@PathVariable(value = "rgi_fk") long rgi_fk){
		return conta_aguaRepository.findByRgiAguaFk(rgi_fk);
	}
	

	@PostMapping("/Conta_agua")
	public  Conta_agua createConta_agua(@RequestBody Conta_agua conta_agua) {
		return conta_aguaRepository.save(conta_agua);
	}
	
	@PutMapping("/Conta_agua")
	public  Conta_agua atualizarConta_agua(@RequestBody Conta_agua conta_agua) {
		return conta_aguaRepository.save(conta_agua);
	}
	
	
	@PutMapping("/conta_agua/{rgi_agua}/contrato/{instalacao_cont}")
	public Conta_agua ColocarContratoNaConta(
	            @PathVariable Long rgi_agua,
	            @PathVariable Long instalacao_cont
	    ) {
	    	 Conta_agua  conta_agua = conta_aguaRepository.findById(rgi_agua).get();
	        Contrato contrato = contratoRepository.findById(instalacao_cont).get();
	        conta_agua.setContrato(contrato);
	        return conta_aguaRepository.save(conta_agua);
	    }
	

	@DeleteMapping("/Conta_agua")
	public  void deleteConta_agua(@RequestBody Conta_agua conta_agua) {
		conta_aguaRepository.delete(conta_agua);
	}
}