package almeida.fernando.fitmeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Aviso;
import almeida.fernando.fitmeapp.repository.AvisosRepository;

@Service
public class AvisosService {

	@Autowired
	private AvisosRepository avisosRepo;

	@Transactional
	public List<Aviso> findAll() {
		return avisosRepo.findAll();
	}

	@Transactional
	public void saveOrUpdate(Aviso aviso) {
		//Update else Insert
		if(aviso.getId() != null){
			avisosRepo.save(aviso);
		}else{
			avisosRepo.insert(aviso);
		}
	}

}
