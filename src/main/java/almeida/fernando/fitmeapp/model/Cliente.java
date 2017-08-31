package almeida.fernando.fitmeapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente extends Usuario {

	private String idInstrutor;

	public String getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(String idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

}
