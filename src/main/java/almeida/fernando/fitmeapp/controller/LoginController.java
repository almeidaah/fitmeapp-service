package almeida.fernando.fitmeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.service.LoginService;

@Controller
@RequestMapping("fitme/v1/login")
@CrossOrigin(origins="*")

public class LoginController {

	@Autowired
	private LoginService loginService;
	
	/**
	 * @param codAcademia
	 * @param login4
	 * @param senha
	 * @return Usuario logado
	 */
	@PostMapping
	@ResponseBody
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
		Usuario dbUser = null;
		dbUser = loginService.login(usuario.getIdAcademia(), usuario.getLogin(), usuario.getSenha());
		
		if(dbUser != null){
			return new ResponseEntity<>(dbUser, HttpStatus.OK);
		}else{
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
}
