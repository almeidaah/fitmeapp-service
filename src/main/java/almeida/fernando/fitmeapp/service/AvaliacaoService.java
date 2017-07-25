package almeida.fernando.fitmeapp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Avaliacao;
import almeida.fernando.fitmeapp.repository.AvaliacaoRepository;

@Service
@Transactional
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;

	public List<Avaliacao> findAll() {
		return avaliacaoRepository.findAllByOrderByDataAvaliacaoDesc();
	}

	public void delete(String id) {
		avaliacaoRepository.delete(id);
	}

	public List<Avaliacao> findByUserId(String userId) {
		return avaliacaoRepository.findByUserId(userId);
	}
	
	public Avaliacao insert(Avaliacao avaliacao) {

		if (org.springframework.util.StringUtils.isEmpty(avaliacao.getId())) {
			avaliacao.setDataAvaliacao(new Date());
			return avaliacaoRepository.insert(avaliacao);
		}
		return avaliacaoRepository.save(avaliacao);
	}

	public void deleteAvaliacoesUser(String userId) {
		List<Avaliacao> avaliacoes = avaliacaoRepository.findByUserId(userId);
		avaliacoes.forEach(avaliacao -> avaliacaoRepository.delete(avaliacao));
	}
}
