package com.tecsus.API.upload;
import org.springframework.hateoas.RepresentationModel;


import lombok.Getter;
import lombok.Setter;


public class AdaptadorArquivo extends RepresentationModel<AdaptadorArquivo> {
	@Getter
	@Setter
	private Long id;
	private String nome;
	private String tamanho;
	private String tipo;
 
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
}