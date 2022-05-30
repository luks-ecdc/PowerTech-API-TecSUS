package com.tecsus.API.entities;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


import lombok.Getter;
import lombok.Setter;

@Entity
public class Arquivo extends RepresentationModel<Arquivo> {

@Getter
@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nome;
	@Column
	private String tamanho;
	@Column
	private String tipo;
	@Lob
	@Column
	private byte[] bytes;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTamanho() {
	return tamanho;
}

public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public byte[] getBytes() {
	return bytes;
}

public void setBytes(byte[] bytes) {
	this.bytes = bytes;
}

}

