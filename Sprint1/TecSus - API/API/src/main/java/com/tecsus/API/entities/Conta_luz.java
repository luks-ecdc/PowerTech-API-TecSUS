package com.tecsus.API.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "LUZ")
public class Conta_luz extends Conta {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Conta_luz(){}	
	public Conta_luz(Long id_conta, Long id_usuario, Long id_contrato, int pDF, int valor_conta_total,
			int numeroInstalação, double consumoMes, double tusdConsumoValorFornecido, double tusdConsumoValorICMS,
			double tusdConsumoValorPIS, double tusdConsumoValorCOFINS, double tusdConsumoValorTotal,
			double teConsumoValorFornecido, double teConsumoValorICMS, double teConsumoValorPIS,
			double teConsumoValorCOFINS, double teConsumoValorTotal, double cipValorFornecido,
			double cipConsumoValorICMS, double cipConsumoValorPIS, double cipConsumoValorCOFINS,
			double cipConsumoValorTotal, double cofinsValor, double pisValor, double iCMSValor) {
		super(id_conta, id_usuario, id_contrato, pDF, valor_conta_total);
		this.numeroInstalação = numeroInstalação;
		this.consumoMes = consumoMes;
		this.tusdConsumoValorFornecido = tusdConsumoValorFornecido;
		this.tusdConsumoValorICMS = tusdConsumoValorICMS;
		this.tusdConsumoValorPIS = tusdConsumoValorPIS;
		this.tusdConsumoValorCOFINS = tusdConsumoValorCOFINS;
		this.tusdConsumoValorTotal = tusdConsumoValorTotal;
		this.teConsumoValorFornecido = teConsumoValorFornecido;
		this.teConsumoValorICMS = teConsumoValorICMS;
		this.teConsumoValorPIS = teConsumoValorPIS;
		this.teConsumoValorCOFINS = teConsumoValorCOFINS;
		this.teConsumoValorTotal = teConsumoValorTotal;
		this.cipValorFornecido = cipValorFornecido;
		this.cipConsumoValorICMS = cipConsumoValorICMS;
		this.cipConsumoValorPIS = cipConsumoValorPIS;
		this.cipConsumoValorCOFINS = cipConsumoValorCOFINS;
		this.cipConsumoValorTotal = cipConsumoValorTotal;
		this.cofinsValor = cofinsValor;
		this.pisValor = pisValor;
		ICMSValor = iCMSValor;
	}
	private int numeroInstalação;
	private double consumoMes;
	private double tusdConsumoValorFornecido;
	private double tusdConsumoValorICMS;
	private double tusdConsumoValorPIS;
	private double tusdConsumoValorCOFINS;
	private double tusdConsumoValorTotal;
	private double teConsumoValorFornecido;
	private double teConsumoValorICMS;
	private double teConsumoValorPIS;
	private double teConsumoValorCOFINS;
	private double teConsumoValorTotal;
	private double cipValorFornecido;
	private double cipConsumoValorICMS;
	private double cipConsumoValorPIS;
	private double cipConsumoValorCOFINS;
	private double cipConsumoValorTotal;
	private double cofinsValor;
	private double pisValor;
	private double ICMSValor;


	public int getNumeroInstalação() {
		return numeroInstalação;
	}
	public void setNumeroInstalação(int numeroInstalação) {
		this.numeroInstalação = numeroInstalação;
	}
	public double getConsumoMes() {
		return consumoMes;
	}
	public void setConsumoMes(double consumoMes) {
		this.consumoMes = consumoMes;
	}
	public double getTusdConsumoValorFornecido() {
		return tusdConsumoValorFornecido;
	}
	public void setTusdConsumoValorFornecido(double tusdConsumoValorFornecido) {
		this.tusdConsumoValorFornecido = tusdConsumoValorFornecido;
	}
	public double getTusdConsumoValorICMS() {
		return tusdConsumoValorICMS;
	}
	public void setTusdConsumoValorICMS(double tusdConsumoValorICMS) {
		this.tusdConsumoValorICMS = tusdConsumoValorICMS;
	}
	public double getTusdConsumoValorPIS() {
		return tusdConsumoValorPIS;
	}
	public void setTusdConsumoValorPIS(double tusdConsumoValorPIS) {
		this.tusdConsumoValorPIS = tusdConsumoValorPIS;
	}
	public double getTusdConsumoValorCOFINS() {
		return tusdConsumoValorCOFINS;
	}
	public void setTusdConsumoValorCOFINS(double tusdConsumoValorCOFINS) {
		this.tusdConsumoValorCOFINS = tusdConsumoValorCOFINS;
	}
	public double getTusdConsumoValorTotal() {
		return tusdConsumoValorTotal;
	}
	public void setTusdConsumoValorTotal(double tusdConsumoValorTotal) {
		this.tusdConsumoValorTotal = tusdConsumoValorTotal;
	}
	public double getTeConsumoValorFornecido() {
		return teConsumoValorFornecido;
	}
	public void setTeConsumoValorFornecido(double teConsumoValorFornecido) {
		this.teConsumoValorFornecido = teConsumoValorFornecido;
	}
	public double getTeConsumoValorICMS() {
		return teConsumoValorICMS;
	}
	public void setTeConsumoValorICMS(double teConsumoValorICMS) {
		this.teConsumoValorICMS = teConsumoValorICMS;
	}
	public double getTeConsumoValorPIS() {
		return teConsumoValorPIS;
	}
	public void setTeConsumoValorPIS(double teConsumoValorPIS) {
		this.teConsumoValorPIS = teConsumoValorPIS;
	}
	public double getTeConsumoValorCOFINS() {
		return teConsumoValorCOFINS;
	}
	public void setTeConsumoValorCOFINS(double teConsumoValorCOFINS) {
		this.teConsumoValorCOFINS = teConsumoValorCOFINS;
	}
	public double getTeConsumoValorTotal() {
		return teConsumoValorTotal;
	}
	public void setTeConsumoValorTotal(double teConsumoValorTotal) {
		this.teConsumoValorTotal = teConsumoValorTotal;
	}
	public double getCipValorFornecido() {
		return cipValorFornecido;
	}
	public void setCipValorFornecido(double cipValorFornecido) {
		this.cipValorFornecido = cipValorFornecido;
	}
	public double getCipConsumoValorICMS() {
		return cipConsumoValorICMS;
	}
	public void setCipConsumoValorICMS(double cipConsumoValorICMS) {
		this.cipConsumoValorICMS = cipConsumoValorICMS;
	}
	public double getCipConsumoValorPIS() {
		return cipConsumoValorPIS;
	}
	public void setCipConsumoValorPIS(double cipConsumoValorPIS) {
		this.cipConsumoValorPIS = cipConsumoValorPIS;
	}
	public double getCipConsumoValorCOFINS() {
		return cipConsumoValorCOFINS;
	}
	public void setCipConsumoValorCOFINS(double cipConsumoValorCOFINS) {
		this.cipConsumoValorCOFINS = cipConsumoValorCOFINS;
	}
	public double getCipConsumoValorTotal() {
		return cipConsumoValorTotal;
	}
	public void setCipConsumoValorTotal(double cipConsumoValorTotal) {
		this.cipConsumoValorTotal = cipConsumoValorTotal;
	}
	public double getCofinsValor() {
		return cofinsValor;
	}
	public void setCofinsValor(double cofinsValor) {
		this.cofinsValor = cofinsValor;
	}
	public double getPisValor() {
		return pisValor;
	}
	public void setPisValor(double pisValor) {
		this.pisValor = pisValor;
	}
	public double getICMSValor() {
		return ICMSValor;
	}
	public void setICMSValor(double iCMSValor) {
		ICMSValor = iCMSValor;
	}
	
	
	
	
	
	
}
