package almeida.fernando.fitmeapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.service.UsuarioService;
import almeida.fernando.fitmeapp.utils.UsuarioUtils;

@Controller
@RequestMapping("fitme/v1/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


	/**
	 * Inserir novo Usuario
	 * 
	 * @param parameters
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Usuario> create(@RequestBody Map<String, String> parameters) {
		Usuario usuario = UsuarioUtils.popularUsuario(parameters);
		Boolean isInstructor = Boolean.valueOf(parameters.get("instrutor"));

		try {
			if (isInstructor) {
				usuarioService.saveInstrutor(usuario);
			} else {
				usuarioService.saveCliente(usuario);
			}
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
