package almeida.fernando.fitmeapp.utils;

import java.util.Date;
import java.util.Map;

import almeida.fernando.fitmeapp.model.Usuario;

public class UsuarioUtils {
	
	private static final String ID = "id";
	private static final String COD_ACADEMIA = "codigoAcademia";
	private static final String LOGIN = "login";
	private static final String SENHA = "senha";
	
	public static Usuario popularUsuario(Map<String, String> parameters) {
		Usuario usuario = new Usuario();
		
		usuario.setId(parameters.get(UsuarioUtils.ID));
		usuario.setCodAcademia(Integer.parseInt(parameters.get(UsuarioUtils.COD_ACADEMIA)));
		usuario.setLogin(parameters.get(UsuarioUtils.LOGIN));
		usuario.setSenha(parameters.get(UsuarioUtils.SENHA));
		usuario.setClienteDesde(new Date());
		
		return usuario;
	}
}
