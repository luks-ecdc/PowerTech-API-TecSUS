package com.tecsus.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsus.API.entities.Conta_gas;
import com.tecsus.API.entities.Conta_luz;

public interface Conta_gasRepository extends JpaRepository<Conta_gas, Long>{
	Conta_gas findById(long id );


}
