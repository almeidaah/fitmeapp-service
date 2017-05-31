package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Academia;

@Repository
public interface AcademiaRepository extends MongoRepository<Academia, String>{

}
