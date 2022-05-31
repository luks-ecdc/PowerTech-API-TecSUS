package com.tecsus.API.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Conta_luz;

@Repository
public interface Conta_luzRepository extends JpaRepository<Conta_luz, Long>{
	Conta_luz findById(long id );
	List<Conta_luz> findByInstalacaoluzFK(long instalacaoluzFK);
	List<Conta_luz> findByDataLuzBetween(Date startDate, Date endDate);

}