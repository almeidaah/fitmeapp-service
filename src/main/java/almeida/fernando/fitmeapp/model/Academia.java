package almeida.fernando.fitmeapp.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Academia {

	@Id
	private String id;

	private String nome;
	private Integer codigo;
	private String contato;
	
	private Map<String, String> redesSociais;

	public Map<String, String> getRedesSociais() {
		return redesSociais;
	}

	public void setRedesSociais(Map<String, String> redesSociais) {
		this.redesSociais = redesSociais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

}
