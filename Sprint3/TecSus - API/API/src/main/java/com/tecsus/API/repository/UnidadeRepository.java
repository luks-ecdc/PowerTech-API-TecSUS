package com.tecsus.API.repository;

import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Unidade;

import org.springframework.data.jpa.repository.JpaRepository;

//Repositorios serve para extender os metodos do JpaRepository, que consegue fazer persistencia dos arquivos no BD

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long>{
	
	Unidade findById(long id );

	
}
