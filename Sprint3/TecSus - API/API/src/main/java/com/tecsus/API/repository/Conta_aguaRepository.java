package com.tecsus.API.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Conta_agua;
import com.tecsus.API.entities.Conta_luz;

@Repository
public interface Conta_aguaRepository extends JpaRepository<Conta_agua, Long>{
	Conta_agua findById(long id );
	
	List<Conta_agua> findByRgiAguaFk(long IdFk);
	
	
	@Query(value="SELECT * FROM tb_conta_agua where rgi_agua_fk = ?1 and data_agua BETWEEN ?2 and ?3 ", nativeQuery = true)
	List<Conta_agua> findPorIdEmPeriodoDeTempo(long rgiAguaFk,Date startDate, Date endDate );
}