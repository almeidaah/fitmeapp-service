package almeida.fernando.fitmeapp.utils;

import java.util.Date;
import java.util.Map;

import org.springframework.util.StringUtils;

import almeida.fernando.fitmeapp.model.Cliente;
import almeida.fernando.fitmeapp.model.Instrutor;
import almeida.fernando.fitmeapp.model.Usuario;

public class UsuarioUtils {
	
	private static final String ID = "id";
	private static final String LOGIN = "login";
	private static final String SENHA = "senha";
	private static final String EMAIL = "email";
	private static final String NOME_COMPLETO = "nomeCompleto";
	private static final String ID_INSTRUTOR = "idInstrutor";
	private static final String IS_INSTRUTOR = "instrutor";

	
	public static Usuario popularUsuario(Map<String, String> parameters) {
		Usuario usuario = new Usuario();
		
		Boolean isInstructor = Boolean.valueOf(parameters.get(UsuarioUtils.IS_INSTRUTOR));
		usuario = isInstructor ? new Instrutor() : new Cliente();

		usuario.setId(parameters.get(UsuarioUtils.ID));
		usuario.setLogin(parameters.get(UsuarioUtils.LOGIN));
		usuario.setSenha(parameters.get(UsuarioUtils.SENHA));
		usuario.setEmail(parameters.get(UsuarioUtils.EMAIL));
		usuario.setNomeCompleto(parameters.get(UsuarioUtils.NOME_COMPLETO));
		usuario.setClienteDesde(new Date());
		
		if(!isInstructor){
			((Cliente)usuario).setIdInstrutor(parameters.get(ID_INSTRUTOR));
		}else{
			((Instrutor)usuario).setNumMaxAlunos(Instrutor.NUM_MAX_ALUNOS_DEFAULT);
		}
		
		return usuario;
	}
}
