package com.tecsus.API.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta_luz")
public class Conta_luz {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
		
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_conta_luz;
	
	
	
	private String data_luz;
	private String periodo_luz;
	//private int pdf_luz; deixar sem por enquanto
	private double tusd_consumo_luz;
	private double te_consumo_luz;
	private double bandeira_tarifa;
	private double tarifa_aplic_luz;
	private double consumo_mes_luz;
	private double tarifa_imposto;
	private double base_calc_icms;
	private double aliq_icms;
	private double valor_icms;
	private double base_calc_piscofins;
	private double aliq_pis;
	private double valor_pis;
	private double aliq_cofins;
	private double valor_confins;
	private double total_luz;
	private double contri_munic;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instalacao_luz_fk", referencedColumnName = "instalacao_cont")
	private Contrato contrato;

	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
	public Conta_luz(){}
	public Conta_luz(Long id_conta_luz, String data_luz, String periodo_luz, double tusd_consumo_luz,
			double te_consumo_luz, double bandeira_tarifa, double tarifa_aplic_luz, double consumo_mes_luz,
			double tarifa_imposto, double base_calc_icms, double aliq_icms, double valor_icms,
			double base_calc_piscofins, double aliq_pis, double valor_pis, double aliq_cofins, double valor_confins,
			double total_luz, double contri_munic, Contrato contrato) {
		super();
		this.id_conta_luz = id_conta_luz;
		this.data_luz = data_luz;
		this.periodo_luz = periodo_luz;
		this.tusd_consumo_luz = tusd_consumo_luz;
		this.te_consumo_luz = te_consumo_luz;
		this.bandeira_tarifa = bandeira_tarifa;
		this.tarifa_aplic_luz = tarifa_aplic_luz;
		this.consumo_mes_luz = consumo_mes_luz;
		this.tarifa_imposto = tarifa_imposto;
		this.base_calc_icms = base_calc_icms;
		this.aliq_icms = aliq_icms;
		this.valor_icms = valor_icms;
		this.base_calc_piscofins = base_calc_piscofins;
		this.aliq_pis = aliq_pis;
		this.valor_pis = valor_pis;
		this.aliq_cofins = aliq_cofins;
		this.valor_confins = valor_confins;
		this.total_luz = total_luz;
		this.contri_munic = contri_munic;
		this.contrato = contrato;
	}
	public Long getId_conta_luz() {
		return id_conta_luz;
	}
	public void setId_conta_luz(Long id_conta_luz) {
		this.id_conta_luz = id_conta_luz;
	}
	public String getData_luz() {
		return data_luz;
	}
	public void setData_luz(String data_luz) {
		this.data_luz = data_luz;
	}
	public String getPeriodo_luz() {
		return periodo_luz;
	}
	public void setPeriodo_luz(String periodo_luz) {
		this.periodo_luz = periodo_luz;
	}
	public double getTusd_consumo_luz() {
		return tusd_consumo_luz;
	}
	public void setTusd_consumo_luz(double tusd_consumo_luz) {
		this.tusd_consumo_luz = tusd_consumo_luz;
	}
	public double getTe_consumo_luz() {
		return te_consumo_luz;
	}
	public void setTe_consumo_luz(double te_consumo_luz) {
		this.te_consumo_luz = te_consumo_luz;
	}
	public double getBandeira_tarifa() {
		return bandeira_tarifa;
	}
	public void setBandeira_tarifa(double bandeira_tarifa) {
		this.bandeira_tarifa = bandeira_tarifa;
	}
	public double getTarifa_aplic_luz() {
		return tarifa_aplic_luz;
	}
	public void setTarifa_aplic_luz(double tarifa_aplic_luz) {
		this.tarifa_aplic_luz = tarifa_aplic_luz;
	}
	public double getConsumo_mes_luz() {
		return consumo_mes_luz;
	}
	public void setConsumo_mes_luz(double consumo_mes_luz) {
		this.consumo_mes_luz = consumo_mes_luz;
	}
	public double getTarifa_imposto() {
		return tarifa_imposto;
	}
	public void setTarifa_imposto(double tarifa_imposto) {
		this.tarifa_imposto = tarifa_imposto;
	}
	public double getBase_calc_icms() {
		return base_calc_icms;
	}
	public void setBase_calc_icms(double base_calc_icms) {
		this.base_calc_icms = base_calc_icms;
	}
	public double getAliq_icms() {
		return aliq_icms;
	}
	public void setAliq_icms(double aliq_icms) {
		this.aliq_icms = aliq_icms;
	}
	public double getValor_icms() {
		return valor_icms;
	}
	public void setValor_icms(double valor_icms) {
		this.valor_icms = valor_icms;
	}
	public double getBase_calc_piscofins() {
		return base_calc_piscofins;
	}
	public void setBase_calc_piscofins(double base_calc_piscofins) {
		this.base_calc_piscofins = base_calc_piscofins;
	}
	public double getAliq_pis() {
		return aliq_pis;
	}
	public void setAliq_pis(double aliq_pis) {
		this.aliq_pis = aliq_pis;
	}
	public double getValor_pis() {
		return valor_pis;
	}
	public void setValor_pis(double valor_pis) {
		this.valor_pis = valor_pis;
	}
	public double getAliq_cofins() {
		return aliq_cofins;
	}
	public void setAliq_cofins(double aliq_cofins) {
		this.aliq_cofins = aliq_cofins;
	}
	public double getValor_confins() {
		return valor_confins;
	}
	public void setValor_confins(double valor_confins) {
		this.valor_confins = valor_confins;
	}
	public double getTotal_luz() {
		return total_luz;
	}
	public void setTotal_luz(double total_luz) {
		this.total_luz = total_luz;
	}
	public double getContri_munic() {
		return contri_munic;
	}
	public void setContri_munic(double contri_munic) {
		this.contri_munic = contri_munic;
	}
	
	
	

	/*@Lob
	@Column(insert="false", update="false")
	private byte[] pdf;

	public byte[] getArquivo() {
		return pdf;
	}
	public void setArquivo(byte[] pdf) {
		this.pdf = pdf;
	}
	*/
	
	
	
	
	
	
	
}