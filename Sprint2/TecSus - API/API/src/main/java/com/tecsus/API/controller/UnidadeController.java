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
import com.tecsus.API.repository.UnidadeRepository;

import io.swagger.annotations.ApiOperation;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping// defini url que vai consultar a entidade
public class UnidadeController {
	
	@Autowired 
	UnidadeRepository unidadeRepository;
	  
	@ApiOperation(value = "Retorna todas unidades")
	@GetMapping("/unidades") // metodo GET
	public List<Unidade> getUnidades(){
		return unidadeRepository.findAll();
	}
	@ApiOperation(value = "Retorna unidade pelo Id")
	@GetMapping("/unidade/byId/{id}") // metodo GET
	public  Unidade getUnidadeId(@PathVariable(value = "id") long id){
		return unidadeRepository.findById(id);
	}
	
	//@ApiOperation(value = "Retorna unidade pelo Cpf")
	//@GetMapping("/unidade/byCpf/{cpf}") // metodo GET
	//public  Unidade getUnidadeByCpf(@PathVariable(value = "cpf") String cpf){
	//	return unidadeRepository.findByCpf(cpf);
	//}
	
	//@ApiOperation(value = "Retorna unidade pelo Cep")
	//@GetMapping("/unidade/byCep/{cep}") // metodo GET
	//public  Unidade getUnidadeIdByCep(@PathVariable(value = "cep") String cep){
	//	return unidadeRepository.findByCep(cep);
	//}
	@ApiOperation(value = "Cadastra unidade no banco de dados")
	@PostMapping("/unidade")
	public  Unidade createUnidade(@RequestBody Unidade unidade) {
		return unidadeRepository.save(unidade);
	}
	
	@ApiOperation(value = "Edita cadastro de unidade")
	@PutMapping("/unidade")
	public  Unidade atualizarUnidade(@RequestBody Unidade unidade) {
		return unidadeRepository.save(unidade);
	}
	@ApiOperation(value = "Deleta cadastro de unidade")
	@DeleteMapping("/unidade")
	public  void deleteUnidade(@RequestBody Unidade unidade) {
		unidadeRepository.delete(unidade);
	}
	
	
	
	 
}
