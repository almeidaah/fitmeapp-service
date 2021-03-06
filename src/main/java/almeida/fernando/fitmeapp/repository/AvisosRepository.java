package almeida.fernando.fitmeapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Aviso;

@Repository
public interface AvisosRepository extends MongoRepository<Aviso, String>{
	
	public List<Aviso> findAllByOrderByDataAvisoDesc();

	public List<Aviso> findAllByIdAcademiaOrderByDataAvisoDesc(String idAcademia);

}
