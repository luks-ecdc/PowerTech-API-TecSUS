package com.tecsus.API.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tecsus.API.repository.ContratoRepository;

@Entity
@Table(name="tb_conta_agua")
public class Conta_agua {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_conta_agua;
	
	private double ate10ConsumoAgua;
	private double de11ate20ConsumoAgua;
	private double de21ate30ConsumoAgua;
	private double de31ate50ConsumoAgua;
	private double acima51ConsumoAgua;
	private double ate10TarifaAgua;
	private double de11ate20TarifaAgua;
	private double de21ate30TarifaAgua;
	private double de31ate50TarifaAgua;
	private double acima51TarifaAgua;
	private double ate10ValorAgua;
	private double de11ate20ValorAgua;
	private double de21ate30ValorAgua;
	private double de31ate50ValorAgua;
	private double acima51ValorAgua;
	
	private double ate10ConsumoEsgoto;
	private double de11ate20ConsumoEsgoto;
	private double de21ate30ConsumoEsgoto;
	private double de31ate50ConsumoEsgoto;
	private double acima51ConsumoEsgoto;
	private double ate10TarifaEsgoto;
	private double de11ate20TarifaEsgoto;
	private double de21ate30TarifaEsgoto;
	private double de31ate50TarifaEsgoto;
	private double acima51TarifaEsgoto;
	private double ate10ValorEsgoto;
	private double de11ate20ValorEsgoto;
	private double de21ate30ValorEsgoto;
	private double de31ate50ValorEsgoto;
	private double acima51ValorEsgoto;
	
	private double consumoTotalAgua;
	private double valorTotalAgua;
	
	private double consumoTotalEsgoto;
	private double valorTotalEsgoto;
	
	private double jurosMora;
	private double AtMonetaria;
	private double multa;
	private double taxaDeRegulacao;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dataAgua;
	
	private double periodo;
	private double total_conta;
	
	
	//@JsonBackReference
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="rgi_agua_fk", referencedColumnName = "instalacao_cont")
	private Contrato contrato;
	
	
	
	 @Column(name="rgi_agua_fk", updatable=false, insertable=false) 
	    private Long rgiAguaFk;
	


	
	
	public Conta_agua() {}
	public Conta_agua(Long id_conta_agua, double ate10ConsumoAgua, double de11ate20ConsumoAgua,
			double de21ate30ConsumoAgua, double de31ate50ConsumoAgua, double acima51ConsumoAgua, double ate10TarifaAgua,
			double de11ate20TarifaAgua, double de21ate30TarifaAgua, double de31ate50TarifaAgua,
			double acima51TarifaAgua, double ate10ValorAgua, double de11ate20ValorAgua, double de21ate30ValorAgua,
			double de31ate50ValorAgua, double acima51ValorAgua, double ate10ConsumoEsgoto,
			double de11ate20ConsumoEsgoto, double de21ate30ConsumoEsgoto, double de31ate50ConsumoEsgoto,
			double acima51ConsumoEsgoto, double ate10TarifaEsgoto, double de11ate20TarifaEsgoto,
			double de21ate30TarifaEsgoto, double de31ate50TarifaEsgoto, double acima51TarifaEsgoto,
			double ate10ValorEsgoto, double de11ate20ValorEsgoto, double de21ate30ValorEsgoto,
			double de31ate50ValorEsgoto, double acima51ValorEsgoto, double consumoTotalAgua, double valorTotalAgua,
			double consumoTotalEsgoto, double valorTotalEsgoto, double jurosMora, double atMonetaria, double multa,
			double taxaDeRegulacao, double periodo, Contrato contrato,Long rgi_agua_fk, Date dataAgua) {
		super();
		this.id_conta_agua = id_conta_agua;
		this.ate10ConsumoAgua = ate10ConsumoAgua;
		this.de11ate20ConsumoAgua = de11ate20ConsumoAgua;
		this.de21ate30ConsumoAgua = de21ate30ConsumoAgua;
		this.de31ate50ConsumoAgua = de31ate50ConsumoAgua;
		this.acima51ConsumoAgua = acima51ConsumoAgua;
		this.ate10TarifaAgua = ate10TarifaAgua;
		this.de11ate20TarifaAgua = de11ate20TarifaAgua;
		this.de21ate30TarifaAgua = de21ate30TarifaAgua;
		this.de31ate50TarifaAgua = de31ate50TarifaAgua;
		this.acima51TarifaAgua = acima51TarifaAgua;
		this.ate10ValorAgua = ate10ValorAgua;
		this.de11ate20ValorAgua = de11ate20ValorAgua;
		this.de21ate30ValorAgua = de21ate30ValorAgua;
		this.de31ate50ValorAgua = de31ate50ValorAgua;
		this.acima51ValorAgua = acima51ValorAgua;
		this.ate10ConsumoEsgoto = ate10ConsumoEsgoto;
		this.de11ate20ConsumoEsgoto = de11ate20ConsumoEsgoto;
		this.de21ate30ConsumoEsgoto = de21ate30ConsumoEsgoto;
		this.de31ate50ConsumoEsgoto = de31ate50ConsumoEsgoto;
		this.acima51ConsumoEsgoto = acima51ConsumoEsgoto;
		this.ate10TarifaEsgoto = ate10TarifaEsgoto;
		this.de11ate20TarifaEsgoto = de11ate20TarifaEsgoto;
		this.de21ate30TarifaEsgoto = de21ate30TarifaEsgoto;
		this.de31ate50TarifaEsgoto = de31ate50TarifaEsgoto;
		this.acima51TarifaEsgoto = acima51TarifaEsgoto;
		this.ate10ValorEsgoto = ate10ValorEsgoto;
		this.de11ate20ValorEsgoto = de11ate20ValorEsgoto;
		this.de21ate30ValorEsgoto = de21ate30ValorEsgoto;
		this.de31ate50ValorEsgoto = de31ate50ValorEsgoto;
		this.acima51ValorEsgoto = acima51ValorEsgoto;
		this.consumoTotalAgua = consumoTotalAgua;
		this.valorTotalAgua = valorTotalAgua;
		this.consumoTotalEsgoto = consumoTotalEsgoto;
		this.valorTotalEsgoto = valorTotalEsgoto;
		this.jurosMora = jurosMora;
		AtMonetaria = atMonetaria;
		this.multa = multa;
		this.taxaDeRegulacao = taxaDeRegulacao;
		this.dataAgua = dataAgua;
		this.periodo = periodo;
		this.contrato = contrato;
		this.rgiAguaFk= rgi_agua_fk;
	}


	public Long getId_conta_agua() {
		return id_conta_agua;
	}


	public void setId_conta_agua(Long id_conta_agua) {
		this.id_conta_agua = id_conta_agua;
	}


	public double getAte10ConsumoAgua() {
		return ate10ConsumoAgua;
	}


	public void setAte10ConsumoAgua(double ate10ConsumoAgua) {
		this.ate10ConsumoAgua = ate10ConsumoAgua;
	}


	public double getDe11ate20ConsumoAgua() {
		return de11ate20ConsumoAgua;
	}


	public void setDe11ate20ConsumoAgua(double de11ate20ConsumoAgua) {
		this.de11ate20ConsumoAgua = de11ate20ConsumoAgua;
	}


	public double getDe21ate30ConsumoAgua() {
		return de21ate30ConsumoAgua;
	}


	public void setDe21ate30ConsumoAgua(double de21ate30ConsumoAgua) {
		this.de21ate30ConsumoAgua = de21ate30ConsumoAgua;
	}


	public double getDe31ate50ConsumoAgua() {
		return de31ate50ConsumoAgua;
	}


	public void setDe31ate50ConsumoAgua(double de31ate50ConsumoAgua) {
		this.de31ate50ConsumoAgua = de31ate50ConsumoAgua;
	}


	public double getAcima51ConsumoAgua() {
		return acima51ConsumoAgua;
	}


	public void setAcima51ConsumoAgua(double acima51ConsumoAgua) {
		this.acima51ConsumoAgua = acima51ConsumoAgua;
	}


	public double getAte10TarifaAgua() {
		return ate10TarifaAgua;
	}


	public void setAte10TarifaAgua(double ate10TarifaAgua) {
		this.ate10TarifaAgua = ate10TarifaAgua;
	}


	public double getDe11ate20TarifaAgua() {
		return de11ate20TarifaAgua;
	}


	public void setDe11ate20TarifaAgua(double de11ate20TarifaAgua) {
		this.de11ate20TarifaAgua = de11ate20TarifaAgua;
	}


	public double getDe21ate30TarifaAgua() {
		return de21ate30TarifaAgua;
	}


	public void setDe21ate30TarifaAgua(double de21ate30TarifaAgua) {
		this.de21ate30TarifaAgua = de21ate30TarifaAgua;
	}


	public double getDe31ate50TarifaAgua() {
		return de31ate50TarifaAgua;
	}


	public void setDe31ate50TarifaAgua(double de31ate50TarifaAgua) {
		this.de31ate50TarifaAgua = de31ate50TarifaAgua;
	}


	public double getAcima51TarifaAgua() {
		return acima51TarifaAgua;
	}


	public void setAcima51TarifaAgua(double acima51TarifaAgua) {
		this.acima51TarifaAgua = acima51TarifaAgua;
	}


	public double getAte10ValorAgua() {
		return ate10ValorAgua;
	}


	public void setAte10ValorAgua(double ate10ValorAgua) {
		this.ate10ValorAgua = ate10ValorAgua;
	}


	public double getDe11ate20ValorAgua() {
		return de11ate20ValorAgua;
	}


	public void setDe11ate20ValorAgua(double de11ate20ValorAgua) {
		this.de11ate20ValorAgua = de11ate20ValorAgua;
	}


	public double getDe21ate30ValorAgua() {
		return de21ate30ValorAgua;
	}


	public void setDe21ate30ValorAgua(double de21ate30ValorAgua) {
		this.de21ate30ValorAgua = de21ate30ValorAgua;
	}


	public double getDe31ate50ValorAgua() {
		return de31ate50ValorAgua;
	}


	public void setDe31ate50ValorAgua(double de31ate50ValorAgua) {
		this.de31ate50ValorAgua = de31ate50ValorAgua;
	}


	public double getAcima51ValorAgua() {
		return acima51ValorAgua;
	}


	public void setAcima51ValorAgua(double acima51ValorAgua) {
		this.acima51ValorAgua = acima51ValorAgua;
	}


	public double getAte10ConsumoEsgoto() {
		return ate10ConsumoEsgoto;
	}


	public void setAte10ConsumoEsgoto(double ate10ConsumoEsgoto) {
		this.ate10ConsumoEsgoto = ate10ConsumoEsgoto;
	}


	public double getDe11ate20ConsumoEsgoto() {
		return de11ate20ConsumoEsgoto;
	}


	public void setDe11ate20ConsumoEsgoto(double de11ate20ConsumoEsgoto) {
		this.de11ate20ConsumoEsgoto = de11ate20ConsumoEsgoto;
	}


	public double getDe21ate30ConsumoEsgoto() {
		return de21ate30ConsumoEsgoto;
	}


	public void setDe21ate30ConsumoEsgoto(double de21ate30ConsumoEsgoto) {
		this.de21ate30ConsumoEsgoto = de21ate30ConsumoEsgoto;
	}


	public double getDe31ate50ConsumoEsgoto() {
		return de31ate50ConsumoEsgoto;
	}


	public void setDe31ate50ConsumoEsgoto(double de31ate50ConsumoEsgoto) {
		this.de31ate50ConsumoEsgoto = de31ate50ConsumoEsgoto;
	}


	public double getAcima51ConsumoEsgoto() {
		return acima51ConsumoEsgoto;
	}


	public void setAcima51ConsumoEsgoto(double acima51ConsumoEsgoto) {
		this.acima51ConsumoEsgoto = acima51ConsumoEsgoto;
	}


	public double getAte10TarifaEsgoto() {
		return ate10TarifaEsgoto;
	}


	public void setAte10TarifaEsgoto(double ate10TarifaEsgoto) {
		this.ate10TarifaEsgoto = ate10TarifaEsgoto;
	}


	public double getDe11ate20TarifaEsgoto() {
		return de11ate20TarifaEsgoto;
	}


	public void setDe11ate20TarifaEsgoto(double de11ate20TarifaEsgoto) {
		this.de11ate20TarifaEsgoto = de11ate20TarifaEsgoto;
	}


	public double getDe21ate30TarifaEsgoto() {
		return de21ate30TarifaEsgoto;
	}


	public void setDe21ate30TarifaEsgoto(double de21ate30TarifaEsgoto) {
		this.de21ate30TarifaEsgoto = de21ate30TarifaEsgoto;
	}


	public double getDe31ate50TarifaEsgoto() {
		return de31ate50TarifaEsgoto;
	}


	public void setDe31ate50TarifaEsgoto(double de31ate50TarifaEsgoto) {
		this.de31ate50TarifaEsgoto = de31ate50TarifaEsgoto;
	}


	public double getAcima51TarifaEsgoto() {
		return acima51TarifaEsgoto;
	}


	public void setAcima51TarifaEsgoto(double acima51TarifaEsgoto) {
		this.acima51TarifaEsgoto = acima51TarifaEsgoto;
	}


	public double getAte10ValorEsgoto() {
		return ate10ValorEsgoto;
	}


	public void setAte10ValorEsgoto(double ate10ValorEsgoto) {
		this.ate10ValorEsgoto = ate10ValorEsgoto;
	}


	public double getDe11ate20ValorEsgoto() {
		return de11ate20ValorEsgoto;
	}


	public void setDe11ate20ValorEsgoto(double de11ate20ValorEsgoto) {
		this.de11ate20ValorEsgoto = de11ate20ValorEsgoto;
	}


	public double getDe21ate30ValorEsgoto() {
		return de21ate30ValorEsgoto;
	}


	public void setDe21ate30ValorEsgoto(double de21ate30ValorEsgoto) {
		this.de21ate30ValorEsgoto = de21ate30ValorEsgoto;
	}


	public double getDe31ate50ValorEsgoto() {
		return de31ate50ValorEsgoto;
	}


	public void setDe31ate50ValorEsgoto(double de31ate50ValorEsgoto) {
		this.de31ate50ValorEsgoto = de31ate50ValorEsgoto;
	}


	public double getAcima51ValorEsgoto() {
		return acima51ValorEsgoto;
	}


	public void setAcima51ValorEsgoto(double acima51ValorEsgoto) {
		this.acima51ValorEsgoto = acima51ValorEsgoto;
	}


	public double getConsumoTotalAgua() {
		return consumoTotalAgua;
	}


	public void setConsumoTotalAgua(double consumoTotalAgua) {
		this.consumoTotalAgua = consumoTotalAgua;
	}


	public double getValorTotalAgua() {
		return valorTotalAgua;
	}


	public void setValorTotalAgua(double valorTotalAgua) {
		this.valorTotalAgua = valorTotalAgua;
	}


	public double getConsumoTotalEsgoto() {
		return consumoTotalEsgoto;
	}


	public void setConsumoTotalEsgoto(double consumoTotalEsgoto) {
		this.consumoTotalEsgoto = consumoTotalEsgoto;
	}


	public double getValorTotalEsgoto() {
		return valorTotalEsgoto;
	}


	public void setValorTotalEsgoto(double valorTotalEsgoto) {
		this.valorTotalEsgoto = valorTotalEsgoto;
	}


	public double getJurosMora() {
		return jurosMora;
	}


	public void setJurosMora(double jurosMora) {
		this.jurosMora = jurosMora;
	}


	public double getAtMonetaria() {
		return AtMonetaria;
	}


	public void setAtMonetaria(double atMonetaria) {
		AtMonetaria = atMonetaria;
	}


	public double getMulta() {
		return multa;
	}


	public void setMulta(double multa) {
		this.multa = multa;
	}


	public double getTaxaDeRegulacao() {
		return taxaDeRegulacao;
	}


	public void setTaxaDeRegulacao(double taxaDeRegulacao) {
		this.taxaDeRegulacao = taxaDeRegulacao;
	}


	public Date getdataAgua() {
		return dataAgua;
	}


	public void setdataAgua(Date dataAgua) {
		this.dataAgua = dataAgua;
	}


	public double getPeriodo() {
		return periodo;
	}


	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}


	public Contrato getContrato() {
		return contrato;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Long getRgi_agua_fk() {
		return rgiAguaFk;
	}
	public void setRgi_agua_fk(Long rgi_agua_fk) {
		this.rgiAguaFk = rgi_agua_fk;
	}
	public double getTotal_conta() {
		return total_conta;
	}
	public void setTotal_conta(double total_conta) {
		this.total_conta = total_conta;
	}
	
	

	
	
	
}