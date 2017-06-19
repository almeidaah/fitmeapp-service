package almeida.fernando.fitmeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	/**,
	 * @param codAcademia
	 * @param login
	 * @param senha
	 * @return Usuario logado
	 */
	@PostMapping
	@ResponseBody
	public Usuario login(Integer codAcademia, String login, String senha){
		
		Usuario usuario = null;
		usuario = loginService.login(login, senha);
		
		//Caso o usuário seja de outra academia
		if(usuario != null && usuario.getCodcademia() != codAcademia){
			return null;
		}

		return usuario;
	}
}
