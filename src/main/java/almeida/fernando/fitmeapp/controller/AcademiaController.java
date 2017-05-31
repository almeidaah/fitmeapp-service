package almeida.fernando.fitmeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}
