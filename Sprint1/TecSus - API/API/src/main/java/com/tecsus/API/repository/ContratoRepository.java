package com.tecsus.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Contrato;


@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long>{
	Contrato findById(long id_contrato );
}
