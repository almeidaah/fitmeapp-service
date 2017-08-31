package almeida.fernando.fitmeapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Instrutor extends Usuario {

	/**
	 * Número máximo de alunos que o instrutor poderá cadastrar
	 * */
	private final Integer numMaxAlunos = 100;

	public Integer getNumMaxAlunos() {
		return numMaxAlunos;
	}

//	public void setNumMaxAlunos(Integer numMaxAlunos) {
//		this.numMaxAlunos = numMaxAlunos;
//	}
}
