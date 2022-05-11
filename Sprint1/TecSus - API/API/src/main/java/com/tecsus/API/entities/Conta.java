package com.tecsus.API.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 4, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Conta")
@Table(name = "tb_conta")
public abstract class Conta implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Incrementa o ID automaticamente
	private Long id_conta;
	private Long id_usuario;//talvez seja int??
	private Long id_contrato;//talvez seja int??
	private int PDF;//obviamente não eh um int, é so por enquanto
	private int valor_conta_total;
	
	@Column(insertable=false, updatable=false)
	private String tipo;//é essa variavel que vai deixar nosso sistema saber qual eh o tipo da conta
	
	
	
	public Conta() {}
	public Conta(Long id_conta, Long id_usuario, Long id_contrato, int pDF, int valor_conta_total) {
		super();
		this.id_conta = id_conta;
		this.id_usuario = id_usuario;
		this.id_contrato = id_contrato;
		PDF = pDF;
		this.valor_conta_total = valor_conta_total;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_conta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(id_conta, other.id_conta);
	}
	public Long getId_conta() {
		return id_conta;
	}
	public void setId_conta(Long id_conta) {
		this.id_conta = id_conta;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Long getId_contrato() {
		return id_contrato;
	}
	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}
	public int getPDF() {
		return PDF;
	}
	public void setPDF(int pDF) {
		PDF = pDF;
	}
	public int getValor_conta_total() {
		return valor_conta_total;
	}
	public void setValor_conta_total(int valor_conta_total) {
		this.valor_conta_total = valor_conta_total;
	}
	
	
	
	
	
}
