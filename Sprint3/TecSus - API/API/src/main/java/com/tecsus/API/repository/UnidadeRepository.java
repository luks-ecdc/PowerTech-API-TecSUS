package com.tecsus.API.repository;

import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Unidade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Repositorios serve para extender os metodos do JpaRepository, que consegue fazer persistencia dos arquivos no BD

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long>{
	
	Unidade findById(long id );
	
	@Query("FROM Unidade where nome_uni= ?1")
	List<Unidade> findByNomeUni(String nomeUni);

	
}
