package com.tecsus.API.resources;

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
import com.tecsus.API.repository.UsuarioRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping// defini url que vai consultar a entidade
public class UsuarioResource {
	
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios") // metodo GET
	public List<Usuario> getUsuarios(){
	//	Usuario u = new Usuario (1L, "Fred",Funcao.ADMINISTRADOR,"fred@teste.com","123456",1);
		//return ResponseEntity.ok().body(u);
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}") // metodo GET
	public  Usuario getUsuarioId(@PathVariable(value = "id") long id){
		return usuarioRepository.findById(id);
	}
	
	@GetMapping("/usuarios/{username}") // metodo GET
	public  Usuario getUsuarioByUsername(@PathVariable(value = "username") String username){
		return usuarioRepository.findByUsername(username);
	}
	
	@PostMapping("/usuario")
	public  Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@PutMapping("/usuario")
	public  Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/usuario")
	public  void deleteUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	 
}
