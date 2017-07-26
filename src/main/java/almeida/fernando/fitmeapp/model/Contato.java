package almeida.fernando.fitmeapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contato {

	@Id
	private String id;

	private String nomePessoa;
	private String email;
	private Long telefone;
	private String mensagem;
	
	//todo contato estará vinculado a acamia em que o usuário estiver logado.
	private String idAcademia;

	private Date data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		
		this.data = data;
	}

	public String getIdAcademia() {
		return idAcademia;
	}

	public void setIdAcademia(String idAcademia) {
		this.idAcademia = idAcademia;
	}
}
