package com.tecsus.API.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Contrato;


@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long>{
	Contrato findById(long id_contrato );
	//@Query(value="select * from tb_contrato where id_cpf_fk = 401;")
	//@Query(value="SELECT u FROM tb_contrato u WHERE tb_contrato.id_cpf_fk.id_cpf = ?1")
	//List<Contrato> findByservico(String servico);
	//List<Contrato> findByid_CPF_fk(String id_cpf);
}