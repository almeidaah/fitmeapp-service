package almeida.fernando.fitmeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Treino;
import almeida.fernando.fitmeapp.repository.TreinoRepository;

@Service
@Transactional
public class TreinoService {

	@Autowired
	private TreinoRepository treinoRepository;
	
	public List<Treino> findAll() {
		return treinoRepository.findAllByOrderByDataTreinoDesc();
	}

	public List<Treino> findByUserId(String userId) {
		return treinoRepository.findByUserId(userId);
	}

	public void deleteUserTrainings(String userId) {
		List<Treino> userTrainings = treinoRepository.findByUserId(userId);
		userTrainings.forEach(training -> treinoRepository.delete(training));
	}
	
}
