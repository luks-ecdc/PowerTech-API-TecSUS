package com.tecsus.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Conta_agua;

@Repository
public interface Conta_aguaRepository extends JpaRepository<Conta_agua, Long>{
	Conta_agua findById(long id );
}
