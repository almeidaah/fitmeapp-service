package almeida.fernando.fitmeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Academia;
import almeida.fernando.fitmeapp.repository.AcademiaRepository;

@Service
@Transactional
public class AcademiaService {

	@Autowired
	private AcademiaRepository academiaRepository;

	public List<Academia> findAll() {
		return academiaRepository.findAll();
	}

	public void delete(String id) {
		academiaRepository.delete(id);
	}

	public Academia findOne(String id) {
		return academiaRepository.findOne(id);
	}
	
	public Academia findByCodigo(Integer codigo) {
		return academiaRepository.findByCodigo(codigo);
	}

	public Academia insert(Academia academia) {

		if (org.springframework.util.StringUtils.isEmpty(academia.getId())) {
			return academiaRepository.insert(academia);
		}
		return academiaRepository.save(academia);
	}


}
