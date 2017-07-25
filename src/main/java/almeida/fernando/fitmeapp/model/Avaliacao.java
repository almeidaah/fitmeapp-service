package almeida.fernando.fitmeapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Avaliacao {

	@Id
	private String id;

	private Date dataAvaliacao;

	private String userId;

	// Dados Gerais
	private Double estatura;
	private Integer peso;
	private Double IMC;
	private Integer bcWells;

	// Estimativas;
	private Double percGordura;
	private Double percPesoGordo;
	private Double pesoMagro;
	private Double pesoAlvo;

	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Double getIMC() {
		return IMC;
	}

	public void setIMC(Double iMC) {
		IMC = iMC;
	}

	public Integer getBcWells() {
		return bcWells;
	}

	public void setBcWells(Integer bcWells) {
		this.bcWells = bcWells;
	}

	public Double getPercGordura() {
		return percGordura;
	}

	public void setPercGordura(Double percGordura) {
		this.percGordura = percGordura;
	}

	public Double getPercPesoGordo() {
		return percPesoGordo;
	}

	public void setPercPesoGordo(Double percPesoGordo) {
		this.percPesoGordo = percPesoGordo;
	}

	public Double getPesoMagro() {
		return pesoMagro;
	}

	public void setPesoMagro(Double pesoMagro) {
		this.pesoMagro = pesoMagro;
	}

	public Double getPesoAlvo() {
		return pesoAlvo;
	}

	public void setPesoAlvo(Double pesoAlvo) {
		this.pesoAlvo = pesoAlvo;
	}

}
