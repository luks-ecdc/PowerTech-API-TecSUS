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
import com.tecsus.API.entities.Usuario;
import com.tecsus.API.entities.enums.Funcao;
import com.tecsus.API.repository.UsuarioRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "/usuario")// defini url que vai consultar a entidade
public class UsuarioController {
	
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	@GetMapping // metodo GET
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("byId/{id}") // metodo GET
	public  Usuario getUsuarioId(@PathVariable(value = "id") long id){
		return usuarioRepository.findById(id);
	}
	
	@GetMapping("byUsername/{username}") // metodo GET
	public  Usuario getUsuarioByUsername(@PathVariable(value = "username") String username){
		return usuarioRepository.findByUsername(username);
	}
	
	@GetMapping("byFuncao/{funcao}") // metodo GET
	public  List<Usuario> getUsuarioByFuncao(@PathVariable(value = "funcao") Funcao funcao){
		return usuarioRepository.findByFuncao(funcao);
	}
	
	
	@PostMapping
	public  Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@PutMapping
	public  Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("{id}")
	public  void deleteUsuario(@PathVariable(value = "id") long id) {
		usuarioRepository.deleteById(id);
	}
	
	 
}
