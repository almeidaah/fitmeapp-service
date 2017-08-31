package almeida.fernando.fitmeapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Instrutor extends Usuario {

	/**
	 * Número máximo de alunos que o instrutor poderá cadastrar
	 * */
	public static final Integer NUM_MAX_ALUNOS_DEFAULT = 100;
	
	private Integer numMaxAlunos;

	public Integer getNumMaxAlunos() {
		return numMaxAlunos;
	}

	public void setNumMaxAlunos(Integer numMaxAlunos) {
		this.numMaxAlunos = numMaxAlunos;
	}
}
