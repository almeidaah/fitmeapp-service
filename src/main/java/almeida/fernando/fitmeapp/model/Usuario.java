package almeida.fernando.fitmeapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
	
	@Id
	private String id;

	private Integer codigoAcademia;
	
	private String login;
	private String senha;
	
	private Date clienteDesde;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCodigoAcademia() {
		return codigoAcademia;
	}

	public void setCodigoAcademia(Integer codigoAcademia) {
		this.codigoAcademia = codigoAcademia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(Date clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
	
	
	
}
