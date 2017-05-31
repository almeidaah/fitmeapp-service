package almeida.fernando.fitmeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Treino;
import almeida.fernando.fitmeapp.repository.TreinoRepository;

@Service
public class TreinoService {

	@Autowired
	private TreinoRepository treinoRepository;
	
	@Transactional
	public List<Treino> findAll() {
		return treinoRepository.findAll();
	}

	@Transactional
	public List<Treino> findByUserId(Integer userId) {
		return treinoRepository.findByUserId(userId);
	}
	
}
