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

import almeida.fernando.fitmeapp.model.Academia;
import almeida.fernando.fitmeapp.service.AcademiaService;

@Controller
@RequestMapping("fitme/v1/academias")
@CrossOrigin(origins="*")
public class AcademiaController {
	
	@Autowired
	private AcademiaService academiaService;
	
	/**
	 * Retorna todas as academias cadastradas
	 */
	@GetMapping
	@ResponseBody
	public List<Academia> findAll(){
		return academiaService.findAll();
	}

	/**
	 * Busca academia por ID
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Academia findOne(@PathVariable String id){
		return academiaService.findOne(id);
	}

	/**
	 * Deleta uma academia da lista
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Academia> delete(@PathVariable String id){
		academiaService.delete(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Academia> insert(@RequestBody Academia academia){
		academiaService.insert(academia);
		return new ResponseEntity<Academia>(academia, HttpStatus.CREATED);
	}	

}
