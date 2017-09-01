//package almeida.fernando.fitmeapp.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import almeida.fernando.fitmeapp.model.Treino;
//import almeida.fernando.fitmeapp.service.TreinoService;
//
//@Controller
//@RequestMapping("fitme/v1/treinos")
//@CrossOrigin(origins="*")
//public class TreinoController {
//	
//	@Autowired
//	private TreinoService treinoService;
//	
//	/**
//	 * Retorna todos os treinos cadastrados
//	 */
//	@GetMapping
//	@ResponseBody
//	public List<Treino> findAll(){
//		return treinoService.findAll();
//	}
//	
//	/**
//	 * Retorna todos os treinos de um usuário
//	 * @param userId
//	 * @return
//	 */
//	@GetMapping("/{userId}")
//	@ResponseBody
//	public List<Treino> findByUserId(@PathVariable String userId){
//		return treinoService.findByUserId(userId);
//	}
//	
//	/**
//	 * Deletar todos os treinos de um usuário
//	 * @param userId
//	 * @return
//	 */
//	@DeleteMapping("/{userId}")
//	@ResponseBody
//	public ResponseEntity<Treino> delete(@PathVariable String userId){
//		treinoService.deleteUserTrainings(userId);
//		return new ResponseEntity<>(null, HttpStatus.OK);
//
//	}
//	
//
//}
