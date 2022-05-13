package com.tecsus.API.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Usuario;
import com.tecsus.API.entities.enums.Funcao;

//Repositorios serve para extender os metodos do JpaRepository, que consegue fazer persistencia dos arquivos no BD

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id );
	
	Usuario findByUsername(String username);

	Usuario findByEmail(String email);
	
	//Usar list para retornar mais de um objeto
	List<Usuario> findByFuncao(Funcao funcao );

}
