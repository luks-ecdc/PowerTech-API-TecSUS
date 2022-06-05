package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // Mapea a classe como uma tabela no banco de dados
@Table(name = "tb_unidade")
public class Unidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id_CPF;
	
	
	private String nomeUni;
	private String cep_uni;
	private String rua_uni;
	private String bairro_uni;
	private String numero_uni;
	private String cidade_uni;
	private String estado_uni;
	private String complemento_uni;
	private String cel_uni;
	private String tel_uni;
	
	@JsonIgnore
	@OneToMany(mappedBy = "unidade",cascade = CascadeType.ALL ,orphanRemoval = true)
	private List<Contrato> contrato;
	
	
	public List<Contrato> getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = (List<Contrato>) contrato;
	}

	public Unidade() {}
	
	public Unidade(Long id_CPF, String nome_uni, String cep_uni, String rua_uni, String bairro_uni, String numero_uni,
			String cidade_uni, String estado_uni, String complemento_uni, String cel_uni, String tel_uni) {
		super();
		this.id_CPF = id_CPF;
		this.nomeUni = nome_uni;
		this.cep_uni = cep_uni;
		this.rua_uni = rua_uni;
		this.bairro_uni = bairro_uni;
		this.numero_uni = numero_uni;
		this.cidade_uni = cidade_uni;
		this.estado_uni = estado_uni;
		this.complemento_uni = complemento_uni;
		this.cel_uni = cel_uni;
		this.tel_uni = tel_uni;
	}
	// Inicio Construtores 
	
	public Long getId_CPF() {
		return id_CPF;
	}
	public void setId_CPF(Long id_CPF) {
		this.id_CPF = id_CPF;
	}
	public String getNome_uni() {
		return nomeUni;
	}
	public void setNome_uni(String nome_uni) {
		this.nomeUni = nome_uni;
	}
	public String getCep_uni() {
		return cep_uni;
	}
	public void setCep_uni(String cep_uni) {
		this.cep_uni = cep_uni;
	}
	public String getRua_uni() {
		return rua_uni;
	}
	public void setRua_uni(String rua_uni) {
		this.rua_uni = rua_uni;
	}
	public String getBairro_uni() {
		return bairro_uni;
	}
	public void setBairro_uni(String bairro_uni) {
		this.bairro_uni = bairro_uni;
	}
	public String getNumero_uni() {
		return numero_uni;
	}
	public void setNumero_uni(String numero_uni) {
		this.numero_uni = numero_uni;
	}
	public String getCidade_uni() {
		return cidade_uni;
	}
	public void setCidade_uni(String cidade_uni) {
		this.cidade_uni = cidade_uni;
	}
	public String getEstado_uni() {
		return estado_uni;
	}
	public void setEstado_uni(String estado_uni) {
		this.estado_uni = estado_uni;
	}
	public String getComplemento_uni() {
		return complemento_uni;
	}
	public void setComplemento_uni(String complemento_uni) {
		this.complemento_uni = complemento_uni;
	}
	public String getCel_uni() {
		return cel_uni;
	}
	public void setCel_uni(String cel_uni) {
		this.cel_uni = cel_uni;
	}
	public String getTel_uni() {
		return tel_uni;
	}
	public void setTel_uni(String tel_uni) {
		this.tel_uni = tel_uni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_CPF);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidade other = (Unidade) obj;
		return Objects.equals(id_CPF, other.id_CPF);
	}
	
				
}
