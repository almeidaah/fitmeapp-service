package almeida.fernando.fitmeapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	 * Inserir novo Usuario Se passar o parâmetro instrutor é inserido nesta
	 * collection, se não é um cliente.
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

	/**
	 * Busca todos os instrutores cadastrados
	 * 
	 * @return
	 */
	@GetMapping("/{instrutores}")
	public ResponseEntity<List<? extends Usuario>> listAll(@PathVariable Boolean instrutores) {

		List<? extends Usuario> users = new ArrayList<>();
		try {
			users = usuarioService.listAll(instrutores);
			return new ResponseEntity<List<? extends Usuario>>(users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<? extends Usuario>>(users, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
