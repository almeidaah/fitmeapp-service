package almeida.fernando.fitmeapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aviso {

	@Id
	private String id;

	private String titulo;
	private String descricao;
	
	private Date dataAviso;
	
	//Todo aviso está atrelado a uma academia(FK)
	private String idAcademia;


	public String getIdAcademia() {
		return idAcademia;
	}

	public void setIdAcademia(String idAcademia) {
		this.idAcademia = idAcademia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataAviso() {
		return dataAviso;
	}

	public void setDataAviso(Date dataAviso) {
		this.dataAviso = dataAviso;
	}

}
