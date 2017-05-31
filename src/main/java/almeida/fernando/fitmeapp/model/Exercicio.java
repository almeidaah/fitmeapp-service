package almeida.fernando.fitmeapp.model;

import almeida.fernando.fitmeapp.enums.TipoExercicio;

public class Exercicio {

	private String nomeExercicio;
	private TipoExercicio tipoExercicio;
	private String descExercicio;

	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public String getTipoExercicio() {
		return tipoExercicio.getDescricao();
	}

	public void setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	public String getDescExercicio() {
		return descExercicio;
	}

	public void setDescExercicio(String descExercicio) {
		this.descExercicio = descExercicio;
	}
}
