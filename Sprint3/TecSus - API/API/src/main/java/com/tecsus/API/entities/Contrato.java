package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
import javax.persistence.Table;

@Entity // Mapea a classe como uma tabela no banco de dados
@Table(name = "tb_contrato")
public class Contrato implements Serializable{ 

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) // Incrementa o ID automaticamente
		private Long id_contrato;
		private int servico; //agua=0 luz=1 gaz=2		
		private int n_instalacao;
		private String cpf; // acho que n precisa
		
		@ManyToOne	
		@JoinColumn(name = "id_fk_unidade")//nome da coluna que será criada
		private Unidade unidade;
		
		@ManyToOne
		@JoinColumn(name = "id_fk_concessionaria")//nome da coluna que será criada
		private Concessionaria concessionaria;
		
		public Contrato() {}

		public Contrato (long id_contrato, int servico, int n_instalacao,
				String cpf) {
			super();
			this.id_contrato = id_contrato;
			this.servico = servico;
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
		
		// PEga unidade Inteira
	/*	public Unidade getUnidade() {
		      return unidade;
		   }

		   public void setUnidade(Unidade unidade) {
		      this.unidade = unidade;
		   } */

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