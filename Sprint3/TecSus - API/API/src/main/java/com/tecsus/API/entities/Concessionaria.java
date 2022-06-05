package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity // Mapea a classe como uma tabela no banco de dados
@Table(name = "tb_concessionaria")
public class Concessionaria implements Serializable {
	
	@Id	
	private Long cnpj_conces;
	private String nome_conces;
	private String servico_conces;
	private String rua_conces;
	private String numero_conces;
	private String cep_conces;
	private String tel_conces;
	private String cidade_conces;
	
	@JsonIgnore
	@OneToMany(mappedBy = "concessionaria",cascade = CascadeType.ALL ,orphanRemoval = true)
	private List<Contrato> contrato;
	
	
	
	private static final long serialVersionUID = 1L;
	
	public Long getCnpj_conces() {
		return cnpj_conces;
	}
	public void setCnpj_conces(Long cnpj_conces) {
		this.cnpj_conces = cnpj_conces;
	}
	
	public Concessionaria() {}
	public Concessionaria(Long cnpj_conces, String nome_conces, String servico_conces, String rua_conces,
			String numero_conces, String cep_conces, String tel_conces, String cidade_conces, List<Contrato> contrato) {
		super();
		this.cnpj_conces = cnpj_conces;
		this.nome_conces = nome_conces;
		this.servico_conces = servico_conces;
		this.rua_conces = rua_conces;
		this.numero_conces = numero_conces;
		this.cep_conces = cep_conces;
		this.tel_conces = tel_conces;
		this.cidade_conces = cidade_conces;
		this.contrato = contrato;
	}
	public String getNome_conces() {
		return nome_conces;
	}
	public void setNome_conces(String nome_conces) {
		this.nome_conces = nome_conces;
	}
	public String getServico_conces() {
		return servico_conces;
	}
	public void setServico_conces(String servico_conces) {
		this.servico_conces = servico_conces;
	}
	public String getRua_conces() {
		return rua_conces;
	}
	public void setRua_conces(String rua_conces) {
		this.rua_conces = rua_conces;
	}
	public String getNumero_conces() {
		return numero_conces;
	}
	public void setNumero_conces(String numero_conces) {
		this.numero_conces = numero_conces;
	}
	public String getCep_conces() {
		return cep_conces;
	}
	public void setCep_conces(String cep_conces) {
		this.cep_conces = cep_conces;
	}
	public String getTel_conces() {
		return tel_conces;
	}
	public void setTel_conces(String tel_conces) {
		this.tel_conces = tel_conces;
	}
	public String getCidade_conces() {
		return cidade_conces;
	}
	public void setCidade_conces(String cidade_conces) {
		this.cidade_conces = cidade_conces;
	}
	

}