package almeida.fernando.fitmeapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Avaliacao;

@Repository
public interface AvaliacaoRepository extends MongoRepository<Avaliacao, String>{

	List<Avaliacao> findByUserIdOrderByDataAvaliacaoDesc(String userId);

	List<Avaliacao> findAllByOrderByDataAvaliacaoDesc();

}
