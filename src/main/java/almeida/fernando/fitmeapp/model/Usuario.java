package almeida.fernando.fitmeapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String id;

	private String login;
	private String senha;

	private String email;

	private String nomeCompleto;
	
	private Date clienteDesde;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
