package com.tecsus.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Conta_luz;

@Repository
public interface Conta_luzRepository extends JpaRepository<Conta_luz, Long>{
	Conta_luz findById(long id );

}