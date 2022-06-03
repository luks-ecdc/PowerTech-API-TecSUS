package com.tecsus.API.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tecsus.API.entities.Conta_gas;
import com.tecsus.API.entities.Conta_luz;

public interface Conta_gasRepository extends JpaRepository<Conta_gas, Long>{
	Conta_gas findById(long id );
	List<Conta_gas> findByCodgasFK(long codgasFK );
	
	@Query(value="SELECT * FROM tb_conta_gas where codgas_fk = ?1 and data_gas BETWEEN ?2 and ?3 ", nativeQuery = true)
	List<Conta_gas> findPorIdEmPeriodoDeTempo(long codegas,Date startDate, Date endDate );


}
