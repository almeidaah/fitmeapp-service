package almeida.fernando.fitmeapp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Contato;
import almeida.fernando.fitmeapp.repository.ContatosRepository;

@Service
@Transactional
public class ContatoService {

	@Autowired
	private ContatosRepository contatosRepo;

	public List<Contato> findByIdAcademia(String idAcademia) {
		return contatosRepo.findByIdAcademiaOrderByDataDesc(idAcademia);
	}

	public void save(Contato contato) {
		contato.setData(new Date());
		contatosRepo.insert(contato);
	}

	public void delete(String contatoId) {
		contatosRepo.delete(contatoId);

	}

}
