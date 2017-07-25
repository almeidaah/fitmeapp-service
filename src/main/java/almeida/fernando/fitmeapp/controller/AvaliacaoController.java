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

import almeida.fernando.fitmeapp.model.Avaliacao;
import almeida.fernando.fitmeapp.model.Treino;
import almeida.fernando.fitmeapp.service.AvaliacaoService;

@Controller
@RequestMapping("fitme/v1/avaliacoes")
@CrossOrigin(origins="*")
public class AvaliacaoController {
	
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	/**
	 * Retorna todas as avaliacoes cadastradas
	 */
	@GetMapping
	@ResponseBody
	public List<Avaliacao> avaliacaoService(){
		return avaliacaoService.findAll();
	}
	
	/**
	 * Retorna todas as avaliacoes de um usuário
	 * @param userId
	 * @return
	 */
	@GetMapping("/{userId}")
	@ResponseBody
	public List<Avaliacao> findByUserId(@PathVariable String userId){
		return avaliacaoService.findByUserId(userId);
	}

	/**
	 * Deletar todas as avaliacoes de um usuário
	 * @param userId
	 * @return
	 */
	@DeleteMapping("/{userId}")
	@ResponseBody
	public ResponseEntity<Treino> delete(@PathVariable String userId){
		avaliacaoService.deleteAvaliacoesUser(userId);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Avaliacao> insert(@RequestBody Avaliacao avaliacao){
		avaliacaoService.insert(avaliacao);
		return new ResponseEntity<Avaliacao>(avaliacao, HttpStatus.CREATED);
	}	

}
