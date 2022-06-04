package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // Mapea a classe como uma tabela no banco de dados
@Table(name = "tb_concessionaria")
public class Concessionaria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	private Long cnpj;
	private String nome_conces;
	private String fornecimento;
	private String endereco_conces;
	
	public Concessionaria() {}
	
	public Concessionaria(Long cnpj, String nome_conces, String fornecimento, String endereco_conces) {
		super();
		this.cnpj = cnpj;
		this.nome_conces = nome_conces;
		this.fornecimento = fornecimento;
		this.endereco_conces = endereco_conces;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, endereco_conces, fornecimento, nome_conces);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concessionaria other = (Concessionaria) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_conces() {
		return nome_conces;
	}

	public void setNome_conces(String nome_conces) {
		this.nome_conces = nome_conces;
	}

	public String getFornecimento() {
		return fornecimento;
	}

	public void setFornecimento(String fornecimento) {
		this.fornecimento = fornecimento;
	}

	public String getEndereco_conces() {
		return endereco_conces;
	}

	public void setEndereco_conces(String endereco_conces) {
		this.endereco_conces = endereco_conces;
	}
	
	
	
	
	

}
