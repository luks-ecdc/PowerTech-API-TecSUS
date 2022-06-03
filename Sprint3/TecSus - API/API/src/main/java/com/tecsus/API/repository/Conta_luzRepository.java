package com.tecsus.API.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Conta_luz;

@Repository
public interface Conta_luzRepository extends JpaRepository<Conta_luz, Long>{
	Conta_luz findById(long id );
	List<Conta_luz> findByInstalacaoluzFK(long instalacaoluzFK);
	List<Conta_luz> findByDataLuzBetween(Date startDate, Date endDate);
	
	//@Query(value="SELECT * FROM tb_conta_luz  WHERE instalacao_luz_fk = ?1", nativeQuery = true)
	//List<Conta_luz> findAll(long instalacaoluzFK);

	
	@Query(value="SELECT * FROM tb_conta_luz where instalacao_luz_fk = ?1 and data_luz BETWEEN ?2 and ?3 ", nativeQuery = true)
	List<Conta_luz> findPorIdEmPeriodoDeTempo(long instalacaoluzFK,Date startDate, Date endDate );
	
	
	
}