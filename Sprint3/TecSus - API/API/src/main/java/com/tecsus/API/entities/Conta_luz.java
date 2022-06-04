package com.tecsus.API.entities;

import java.sql.Date;

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

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dataLuz;
	
	private String periodo_luz;
	//private int pdf_luz; deixar sem por enquanto
	
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
	
	private int bandeiraTarifaria;
	
	private double  bandeiraTarifariaValorFornecido;
	private double  bandeiraTarifariaValorICMS;
	private double  bandeiraTarifariaValorPIS;
	private double  bandeiraTarifariaValorCOFINS;
	private double  bandeiraTarifariaValorValorTotal;
	
	
	
	private double cipValorFornecido;
	private double cipConsumoValorICMS;
	private double cipConsumoValorPIS;
	private double cipConsumoValorCOFINS;
	private double cipConsumoValorTotal;
	
	private double cofinsValor;
	private double pisValor;
	private double ICMSValor;
	private double multa;
	private double jurosMora;
	private double fic;
	private double bonificacao;
	private double total_conta;
	
	@JsonIgnore
	@ManyToOne 
	@JoinColumn(name="instalacao_luz_fk", referencedColumnName = "instalacao_cont")
	private Contrato contrato;
	
	 @Column(name="instalacao_luz_fk", updatable=false, insertable=false) 
	    private Long instalacaoluzFK;

	
	public Conta_luz() {}


	public Conta_luz(Long id_conta_luz, Date dataLuz, String periodo_luz, double consumoMes,
			double tusdConsumoValorFornecido, double tusdConsumoValorICMS, double tusdConsumoValorPIS,
			double tusdConsumoValorCOFINS, double tusdConsumoValorTotal, double teConsumoValorFornecido,
			double teConsumoValorICMS, double teConsumoValorPIS, double teConsumoValorCOFINS,
			double teConsumoValorTotal, int bandeiraTarifaria, double bandeiraTarifariaValorFornecido,
			double bandeiraTarifariaValorICMS, double bandeiraTarifariaValorPIS, double bandeiraTarifariaValorCOFINS,
			double bandeiraTarifariaValorValorTotal, double cipValorFornecido, double cipConsumoValorICMS,
			double cipConsumoValorPIS, double cipConsumoValorCOFINS, double cipConsumoValorTotal, double cofinsValor,
			double pisValor, double iCMSValor, Contrato contrato, Long instalacao_luz_fk) {
		super();
		this.id_conta_luz = id_conta_luz;
		this.dataLuz = dataLuz;
		this.periodo_luz = periodo_luz;
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
		this.bandeiraTarifaria = bandeiraTarifaria;
		this.bandeiraTarifariaValorFornecido = bandeiraTarifariaValorFornecido;
		this.bandeiraTarifariaValorICMS = bandeiraTarifariaValorICMS;
		this.bandeiraTarifariaValorPIS = bandeiraTarifariaValorPIS;
		this.bandeiraTarifariaValorCOFINS = bandeiraTarifariaValorCOFINS;
		this.bandeiraTarifariaValorValorTotal = bandeiraTarifariaValorValorTotal;
		this.cipValorFornecido = cipValorFornecido;
		this.cipConsumoValorICMS = cipConsumoValorICMS;
		this.cipConsumoValorPIS = cipConsumoValorPIS;
		this.cipConsumoValorCOFINS = cipConsumoValorCOFINS;
		this.cipConsumoValorTotal = cipConsumoValorTotal;
		this.cofinsValor = cofinsValor;
		this.pisValor = pisValor;
		this.ICMSValor = iCMSValor;
		this.contrato = contrato;
		this.instalacaoluzFK = instalacao_luz_fk;
	}


	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Long getId_conta_luz() {
		return id_conta_luz;
	}
	public void setId_conta_luz(Long id_conta_luz) {
		this.id_conta_luz = id_conta_luz;
	}
	public Date getDataLuz() {
		return dataLuz;
	}
	public void setData_luz(Date dataLuz) {
		this.dataLuz = dataLuz;
	}
	public String getPeriodo_luz() {
		return periodo_luz;
	}
	public void setPeriodo_luz(String periodo_luz) {
		this.periodo_luz = periodo_luz;
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
	public int getBandeiraTarifaria() {
		return bandeiraTarifaria;
	}
	public void setBandeiraTarifaria(int bandeiraTarifaria) {
		this.bandeiraTarifaria = bandeiraTarifaria;
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
	public double getBandeiraTarifariaValorFornecido() {
		return bandeiraTarifariaValorFornecido;
	}
	public void setBandeiraTarifariaValorFornecido(double bandeiraTarifariaValorFornecido) {
		this.bandeiraTarifariaValorFornecido = bandeiraTarifariaValorFornecido;
	}
	public double getBandeiraTarifariaValorICMS() {
		return bandeiraTarifariaValorICMS;
	}
	public void setBandeiraTarifariaValorICMS(double bandeiraTarifariaValorICMS) {
		this.bandeiraTarifariaValorICMS = bandeiraTarifariaValorICMS;
	}
	public double getBandeiraTarifariaValorPIS() {
		return bandeiraTarifariaValorPIS;
	}
	public void setBandeiraTarifariaValorPIS(double bandeiraTarifariaValorPIS) {
		this.bandeiraTarifariaValorPIS = bandeiraTarifariaValorPIS;
	}
	public double getBandeiraTarifariaValorCOFINS() {
		return bandeiraTarifariaValorCOFINS;
	}
	public void setBandeiraTarifariaValorCOFINS(double bandeiraTarifariaValorCOFINS) {
		this.bandeiraTarifariaValorCOFINS = bandeiraTarifariaValorCOFINS;
	}
	public double getBandeiraTarifariaValorValorTotal() {
		return bandeiraTarifariaValorValorTotal;
	}
	public void setBandeiraTarifariaValorValorTotal(double bandeiraTarifariaValorValorTotal) {
		this.bandeiraTarifariaValorValorTotal = bandeiraTarifariaValorValorTotal;
	}
	public Long getInstalacao_luz_fk() {
		return instalacaoluzFK;
	}
	public void setInstalacao_luz_fk(Long instalacao_luz_fk) {
		this.instalacaoluzFK = instalacao_luz_fk;
	}


	public double getMulta() {
		return multa;
	}


	public void setMulta(double multa) {
		this.multa = multa;
	}


	public double getJurosMora() {
		return jurosMora;
	}


	public void setJurosMora(double jurosMora) {
		this.jurosMora = jurosMora;
	}


	public double getFic() {
		return fic;
	}


	public void setFic(double fic) {
		this.fic = fic;
	}


	public double getBonificacao() {
		return bonificacao;
	}


	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}


	public double getTotal_conta() {
		return total_conta;
	}


	public void setTotal_conta(double total_conta) {
		this.total_conta = total_conta;
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