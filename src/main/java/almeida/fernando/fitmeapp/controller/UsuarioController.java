package almeida.fernando.fitmeapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.service.UsuarioService;
import almeida.fernando.fitmeapp.utils.UsuarioUtils;

@Controller
@RequestMapping("fitme/v1/usuarios")
@CrossOrigin(origins="*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	/**
	 * Inserir novo Usuario
	 * @param parameters
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestParam Map<String, String> parameters){
		Usuario usuario = UsuarioUtils.popularUsuario(parameters);
		usuarioService.save(usuario);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);

	}


}
