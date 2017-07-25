package almeida.fernando.fitmeapp.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Treino {
	
	@Id
	private String id;
	
	@DBRef
	private List<Exercicio> exercicios;

	/**Usuario que possui o treino */
	private String userId;
	
	private Date dataTreino;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDataTreino() {
		return dataTreino;
	}

	public void setDataTreino(Date dataTreino) {
		this.dataTreino = dataTreino;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
