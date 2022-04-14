package com.tecsus.API.repository;

import com.tecsus.API.entities.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//Repositorios serve para extender os metodos do JpaRepository, que consegue fazer persistencia dos arquivos no BD

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id );
	
	Usuario findByUsername(String username );

}
