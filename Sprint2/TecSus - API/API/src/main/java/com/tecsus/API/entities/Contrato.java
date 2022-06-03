package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "tb_contrato")
public class Contrato implements Serializable{ 

		private static final long serialVersionUID = 1L;
		@Id
		private Long instalacao_cont;
		private String servico;
		private String rua_cont;
		private String bairro_cont;
		private String cidade_cont;
		private String estado_cont;
		private String numero_cont;
		private String complemento_cont;
		private String cep_cont;
		private String consumo_cont;
		
		@JsonIgnore
		@OneToMany(mappedBy = "contrato")
		private Set<Conta_agua> conta_agua = new HashSet<>();
		
		public Set<Conta_agua> getConta() {
			return conta_agua;
		}
		
		@JsonIgnore
		@OneToMany(mappedBy = "contrato")
		private Set<Conta_luz> conta_luz = new HashSet<>();
		
		public Set<Conta_luz> Conta_luz() {
			return conta_luz;
		}
			
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="id_CPF_fk", referencedColumnName = "id_CPF")
		private Unidade unidade;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="cnpj_conces_fk", referencedColumnName = "cnpj_conces")
		private Concessionaria concessionaria;
		
		
		
		public Concessionaria getConcessionaria() {
			return concessionaria;
		}

		public void setConcessionaria(Concessionaria concessionaria) {
			this.concessionaria = concessionaria;
		}

		public Unidade getUnidade() {
			return unidade;
		}

		public void setUnidade(Unidade unidade) {
			this.unidade = unidade;
		}

		@Override
		public int hashCode() {
			return Objects.hash(instalacao_cont);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contrato other = (Contrato) obj;
			return Objects.equals(instalacao_cont, other.instalacao_cont);
		}
		
        public Contrato() {}
		public Contrato(Long instalacao_cont, String servico, String rua_cont, String bairro_cont, String cidade_cont,
				String estado_cont, String numero_cont, String complemento_cont, String cep_cont, String consumo_cont) {
			super();
			this.instalacao_cont = instalacao_cont;
			this.servico = servico;
			this.rua_cont = rua_cont;
			this.bairro_cont = bairro_cont;
			this.cidade_cont = cidade_cont;
			this.estado_cont = estado_cont;
			this.numero_cont = numero_cont;
			this.complemento_cont = complemento_cont;
			this.cep_cont = cep_cont;
			this.consumo_cont = consumo_cont;
		}

		public Long getInstalacao_cont() {
			return instalacao_cont;
		}

		public void setInstalacao_cont(Long instalacao_cont) {
			this.instalacao_cont = instalacao_cont;
		}

		public String getServico() {
			return servico;
		}

		public void setServico(String servico) {
			this.servico = servico;
		}

		public String getRua_cont() {
			return rua_cont;
		}

		public void setRua_cont(String rua_cont) {
			this.rua_cont = rua_cont;
		}

		public String getBairro_cont() {
			return bairro_cont;
		}

		public void setBairro_cont(String bairro_cont) {
			this.bairro_cont = bairro_cont;
		}

		public String getCidade_cont() {
			return cidade_cont;
		}

		public void setCidade_cont(String cidade_cont) {
			this.cidade_cont = cidade_cont;
		}

		public String getEstado_cont() {
			return estado_cont;
		}

		public void setEstado_cont(String estado_cont) {
			this.estado_cont = estado_cont;
		}

		public String getNumero_cont() {
			return numero_cont;
		}

		public void setNumero_cont(String numero_cont) {
			this.numero_cont = numero_cont;
		}

		public String getComplemento_cont() {
			return complemento_cont;
		}

		public void setComplemento_cont(String complemento_cont) {
			this.complemento_cont = complemento_cont;
		}

		public String getCep_cont() {
			return cep_cont;
		}

		public void setCep_cont(String cep_cont) {
			this.cep_cont = cep_cont;
		}

		public String getConsumo_cont() {
			return consumo_cont;
		}

		public void setConsumo_cont(String consumo_cont) {
			this.consumo_cont = consumo_cont;
		}

	}