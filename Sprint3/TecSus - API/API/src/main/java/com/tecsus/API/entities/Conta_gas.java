package com.tecsus.API.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_conta_gas")
public class Conta_gas {
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id_conta_gas;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dataGas;
	

	private double consumoFaturado;
	private double tarifaICMS;
	private double fornecimentoGas$;
	private double baseDeCalculo;
	private double icmsporcento;
	private double valorICMS;
	private double valorPIS;
	private double valorCOFINS;
	private double impostoEstaduais;
	private double impostoFederal;
	private double impostoTotal;
	private double valorFatura;
	private double periodo;
	
	
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="codgas_fk", referencedColumnName = "instalacao_cont")
	private Contrato contrato;
	
	 @Column(name="codgas_fk", updatable=false, insertable=false) 
	    private Long codgasFK;
		
	 
	 
	 public Long getId_conta_gas() {
			return id_conta_gas;
		}

		public void setId_conta_gas(Long id_conta_gas) {
			this.id_conta_gas = id_conta_gas;
		}

		public double getConsumoFaturado() {
			return consumoFaturado;
		}

		public void setConsumoFaturado(double consumoFaturado) {
			this.consumoFaturado = consumoFaturado;
		}

		public double getTarifaICMS() {
			return tarifaICMS;
		}

		public void setTarifaICMS(double tarifaICMS) {
			this.tarifaICMS = tarifaICMS;
		}

		public double getFornecimentoGas$() {
			return fornecimentoGas$;
		}

		public void setFornecimentoGas$(double fornecimentoGas$) {
			this.fornecimentoGas$ = fornecimentoGas$;
		}

		public double getBaseDeCalculo() {
			return baseDeCalculo;
		}

		public void setBaseDeCalculo(double baseDeCalculo) {
			this.baseDeCalculo = baseDeCalculo;
		}

		public double getIcmsporcento() {
			return icmsporcento;
		}

		public void setIcmsporcento(double icmsporcento) {
			this.icmsporcento = icmsporcento;
		}

		public double getValorICMS() {
			return valorICMS;
		}

		public void setValorICMS(double valorICMS) {
			this.valorICMS = valorICMS;
		}

		public double getValorPIS() {
			return valorPIS;
		}

		public void setValorPIS(double valorPIS) {
			this.valorPIS = valorPIS;
		}

		public double getValorCONFIS() {
			return valorCOFINS;
		}

		public void setValorCONFIS(double valorCONFIS) {
			this.valorCOFINS = valorCONFIS;
		}

		public double getImpostoEstaduais() {
			return impostoEstaduais;
		}

		public void setImpostoEstaduais(double impostoEstaduais) {
			this.impostoEstaduais = impostoEstaduais;
		}

		public double getImpostoFederal() {
			return impostoFederal;
		}

		public void setImpostoFederal(double impostoFederal) {
			this.impostoFederal = impostoFederal;
		}

		public double getImpostoTotal() {
			return impostoTotal;
		}

		public void setImpostoTotal(double impostoTotal) {
			this.impostoTotal = impostoTotal;
		}

		public double getValorFatura() {
			return valorFatura;
		}

		public void setValorFatura(double valorFatura) {
			this.valorFatura = valorFatura;
		}

		public Contrato getContrato() {
			return contrato;
		}

		public void setContrato(Contrato contrato) {
			this.contrato = contrato;
		}

		public Long getCodgasFK() {
			return codgasFK;
		}

		public void setCodgasFK(Long codgasFK) {
			this.codgasFK = codgasFK;
		}


		public double getPeriodo() {
			return periodo;
		}

		public void setPeriodo(double periodo) {
			this.periodo = periodo;
		}
		



}