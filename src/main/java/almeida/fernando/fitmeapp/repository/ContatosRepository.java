package almeida.fernando.fitmeapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Contato;

@Repository
public interface ContatosRepository extends MongoRepository<Contato, String>{
	
	public List<Contato> findByIdAcademiaOrderByDataDesc(String idAcademia);

}
