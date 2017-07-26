package almeida.fernando.fitmeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import almeida.fernando.fitmeapp.model.Contato;
import almeida.fernando.fitmeapp.service.ContatoService;

@Controller
@RequestMapping("fitme/v1/contato")
@CrossOrigin(origins = "*")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	/**
	 * Retorna todos os contatos da academia(para os instrutores verem)
	 * 
	 * @param idAcademia
	 * @return
	 */
	@GetMapping("/{idAcademia}")
	@ResponseBody
	public List<Contato> findByIdAcademia(@PathVariable String idAcademia) {
		return contatoService.findByIdAcademia(idAcademia);
	}

	/**
	 * Deletar um contato específico
	 * 
	 * @param contatoId
	 * @return
	 */
	@DeleteMapping("/{contatoId}")
	@ResponseBody
	public ResponseEntity<Contato> delete(@PathVariable String contatoId) {
		contatoService.delete(contatoId);
		return new ResponseEntity<>(null, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Contato> save(@RequestBody Contato contato) {
		contatoService.save(contato);
		return new ResponseEntity<>(contato, HttpStatus.OK);
	}

}
