package com.tecsus.API.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "AGUA")
public class Conta_agua extends Conta{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

public Conta_agua() {}

	public Conta_agua(int ate10Consumo, int de11ate20Consumo, int de21ate30Consumo, int de31ate50Consumo,
			int acima51Consumo, double ate10TarifaAgua, double de11ate20TarifaAgua, double de21ate30TarifaAgua,
			double de31ate50cTarifaAgua, double acima51TarifaAgua, double ate10TarifaEsgoto,
			double de11ate20TarifaEsgoto, double de21ate30TarifaEsgoto, double de31ate50cTarifaEsgoto,
			double acima51TarifaEsgoto, Long id_conta, Long id_usuario, Long id_contrato, int pDF, int valor_conta_total) {
		super(id_conta,id_usuario,id_contrato, pDF, valor_conta_total);
		this.ate10Consumo = ate10Consumo;
		this.de11ate20Consumo = de11ate20Consumo;
		this.de21ate30Consumo = de21ate30Consumo;
		this.de31ate50Consumo = de31ate50Consumo;
		this.acima51Consumo = acima51Consumo;
		this.ate10TarifaAgua = ate10TarifaAgua;
		this.de11ate20TarifaAgua = de11ate20TarifaAgua;
		this.de21ate30TarifaAgua = de21ate30TarifaAgua;
		this.de31ate50CTarifaAgua = de31ate50cTarifaAgua;
		this.acima51TarifaAgua = acima51TarifaAgua;
		this.ate10TarifaEsgoto = ate10TarifaEsgoto;
		this.de11ate20TarifaEsgoto = de11ate20TarifaEsgoto;
		this.de21ate30TarifaEsgoto = de21ate30TarifaEsgoto;
		this.de31ate50CTarifaEsgoto = de31ate50cTarifaEsgoto;
		this.acima51TarifaEsgoto = acima51TarifaEsgoto;
	}
	private int ate10Consumo;
	private int de11ate20Consumo;
	private int de21ate30Consumo;
	private int de31ate50Consumo;
	private int acima51Consumo;
	private double  ate10TarifaAgua;
	private double  de11ate20TarifaAgua;
	private double  de21ate30TarifaAgua;
	private double  de31ate50CTarifaAgua;
	private double  acima51TarifaAgua;
	private double  ate10TarifaEsgoto;
	private double  de11ate20TarifaEsgoto;
	private double  de21ate30TarifaEsgoto;
	private double  de31ate50CTarifaEsgoto;
	private double  acima51TarifaEsgoto;

	

	public int getAte10Consumo() {
		return ate10Consumo;
	}

	public void setAte10Consumo(int ate10Consumo) {
		this.ate10Consumo = ate10Consumo;
	}

	public int getDe11ate20Consumo() {
		return de11ate20Consumo;
	}

	public void setDe11ate20Consumo(int de11ate20Consumo) {
		this.de11ate20Consumo = de11ate20Consumo;
	}

	public int getDe21ate30Consumo() {
		return de21ate30Consumo;
	}

	public void setDe21ate30Consumo(int de21ate30Consumo) {
		this.de21ate30Consumo = de21ate30Consumo;
	}

	public int getDe31ate50Consumo() {
		return de31ate50Consumo;
	}

	public void setDe31ate50Consumo(int de31ate50Consumo) {
		this.de31ate50Consumo = de31ate50Consumo;
	}

	public int getAcima51Consumo() {
		return acima51Consumo;
	}

	public void setAcima51Consumo(int acima51Consumo) {
		this.acima51Consumo = acima51Consumo;
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

	public double getDe31ate50CTarifaAgua() {
		return de31ate50CTarifaAgua;
	}

	public void setDe31ate50CTarifaAgua(double de31ate50cTarifaAgua) {
		de31ate50CTarifaAgua = de31ate50cTarifaAgua;
	}

	public double getAcima51TarifaAgua() {
		return acima51TarifaAgua;
	}

	public void setAcima51TarifaAgua(double acima51TarifaAgua) {
		this.acima51TarifaAgua = acima51TarifaAgua;
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

	public double getDe31ate50CTarifaEsgoto() {
		return de31ate50CTarifaEsgoto;
	}

	public void setDe31ate50CTarifaEsgoto(double de31ate50cTarifaEsgoto) {
		de31ate50CTarifaEsgoto = de31ate50cTarifaEsgoto;
	}

	public double getAcima51TarifaEsgoto() {
		return acima51TarifaEsgoto;
	}

	public void setAcima51TarifaEsgoto(double acima51TarifaEsgoto) {
		this.acima51TarifaEsgoto = acima51TarifaEsgoto;
	}
	
	
}
