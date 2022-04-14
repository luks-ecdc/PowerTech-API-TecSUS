package com.tecsus.API.repository;

import com.tecsus.API.entities.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//Repositorios serve para extender os metodos do JpaRepository, que consegue fazer persistencia dos arquivos no BD

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findById(long id );

}
