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

import io.swagger.annotations.ApiOperation;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "/usuario")// defini url que vai consultar a entidade
public class UsuarioController {
	
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	@ApiOperation(value = "Retorna todas usuarios") 
	@GetMapping // metodo GET
	public List	<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@ApiOperation(value = "Retorna usuario pelo Id")
	@GetMapping("byId/{id}") // metodo GET
	public  Usuario getUsuarioId(@PathVariable(value = "id") long id){
		return usuarioRepository.findById(id);
	}
	
	@ApiOperation(value = "Retorna usuario pelo username")
	@GetMapping("byUsername/{username}") // metodo GET
	public  Usuario getUsuarioByUsername(@PathVariable(value = "username") String username){
		return usuarioRepository.findByUsername(username);
	}
	
	@ApiOperation(value = "Retorna unidades pela suas funções")
	@GetMapping("byFuncao/{funcao}") // metodo GET
	public  List<Usuario> getUsuarioByFuncao(@PathVariable(value = "funcao") Funcao funcao){
		return usuarioRepository.findByFuncao(funcao);
	}
	
	@ApiOperation(value = "Retorna unidade pelo email")
	@GetMapping("byEmail/{email}") // metodo GET
	public  Usuario getUsuarioByEMail(@PathVariable(value = "email") String email){
		return usuarioRepository.findByEmail(email);
	}
	
	@ApiOperation(value = "Cadastra usuario no banco de dados")
	@PostMapping
	public  Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	@ApiOperation(value = "Atualiza cadastro usuario no banco de dados")
	@PutMapping
	public  Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	@ApiOperation(value = "Deleta usuario no banco de dados")
	@DeleteMapping("{id}")
	public  void deleteUsuario(@PathVariable(value = "id") long id) {
		usuarioRepository.deleteById(id);
	}
	
	 
}
