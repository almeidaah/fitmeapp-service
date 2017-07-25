package almeida.fernando.fitmeapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Treino;

@Repository
public interface TreinoRepository extends MongoRepository<Treino, String>{

	List<Treino> findByUserId(String userId);

	List<Treino> findAllByOrderByDataTreinoDesc();

}
