package com.tecsus.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsus.API.entities.Arquivo;


public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {
}