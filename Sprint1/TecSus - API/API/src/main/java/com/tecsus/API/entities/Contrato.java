package com.tecsus.API.entities;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Mapea a classe como uma tabela no banco de dados
@Table(name = "tb_contrato")
public class Contrato implements Serializable{ 
	
	


		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) // Incrementa o ID automaticamente
		private Long id_contrato;
		private int servico; //agua=0 luz=1 gaz=2		
		private int id_concessionaria;
		private int id_unidade;//talves seja id_cliente
		private int n_instalacao;
		private String cpf; // acho que n precisa
		
		
		public Contrato() {}
		
		public Contrato (long id_contrato, int servico, int id_concessionaria, int id_unidade, int n_instalacao,
				String cpf) {
			super();
			this.id_contrato = id_contrato;
			this.servico = servico;
			this.id_concessionaria = id_concessionaria;
			this.id_unidade = id_unidade;
			this.n_instalacao = n_instalacao;
			this.cpf = cpf;
		}

		public long getId_contrato() {
			return id_contrato;
		}

		public void setId_contrato(long id_contrato) {
			this.id_contrato = id_contrato;
		}

		public int getServico() {
			return servico;
		}

		public void setServico(int servico) {
			this.servico = servico;
		}

		public int getId_concessionaria() {
			return id_concessionaria;
		}

		public void setId_concessionaria(int id_concessionaria) {
			this.id_concessionaria = id_concessionaria;
		}

		public int getId_unidade() {
			return id_unidade;
		}

		public void setId_unidade(int id_unidade) {
			this.id_unidade = id_unidade;
		}

		public int getN_instalacao() {
			return n_instalacao;
		}

		public void setN_instalacao(int n_instalacao) {
			this.n_instalacao = n_instalacao;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id_contrato);
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
			return Objects.equals(id_contrato, other.id_contrato);
		}

	}

