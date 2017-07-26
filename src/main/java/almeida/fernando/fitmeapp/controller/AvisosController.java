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

import almeida.fernando.fitmeapp.model.Aviso;
import almeida.fernando.fitmeapp.service.AvisosService;

@Controller
@RequestMapping("fitme/v1/avisos")
@CrossOrigin(origins="*")
public class AvisosController {

	@Autowired
	private AvisosService avisosService;
	
	/**
	 * Insere um novo aviso(que será informado a todos)
	 */
	@PostMapping
	public ResponseEntity<Aviso> save(@RequestBody Aviso aviso){
		avisosService.saveOrUpdate(aviso);
		return new ResponseEntity<Aviso>(aviso, HttpStatus.OK);
	}
	
	/**
	 * Encontra todos os avisos publicados.
	 */
	@GetMapping
	@ResponseBody
	public List<Aviso> findAll(){
		return avisosService.findAll();
	}
	
	/**
	 * Encontra todos os avisos publicados.
	 */
	@GetMapping("/findByCodAcademia/{idAcademia}")
	@ResponseBody
	public List<Aviso> findByIdAcademia(String idAcademia){
		return avisosService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Aviso> delete(@PathVariable String id){
		avisosService.delete(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
		
	}
}
