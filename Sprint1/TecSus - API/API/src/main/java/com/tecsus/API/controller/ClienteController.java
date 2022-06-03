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

import com.tecsus.API.entities.Cliente;
import com.tecsus.API.repository.ClienteRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value ="")// defini url que vai consultar a entidade
public class ClienteController {
	
	@Autowired 
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes") // metodo GET
	public List<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}") // metodo GET
	public  Cliente getClienteId(@PathVariable(value = "id") long id){
		return clienteRepository.findById(id);
	}
	

	@PostMapping("/cliente")
	public  Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/cliente")
	public  Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/cliente")
	public  void deleteCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
}
