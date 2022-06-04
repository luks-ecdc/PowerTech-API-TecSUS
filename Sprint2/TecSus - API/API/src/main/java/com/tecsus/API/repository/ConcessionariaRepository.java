package com.tecsus.API.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsus.API.entities.Concessionaria;


@Repository
public interface ConcessionariaRepository extends JpaRepository<Concessionaria, Long>{
 Concessionaria findById(long cnpj);
}