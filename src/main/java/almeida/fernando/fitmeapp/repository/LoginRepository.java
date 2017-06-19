package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Usuario;

@Repository
public interface LoginRepository extends MongoRepository<Usuario, Integer> {

	@Query(value= "{ 'login' : { $regex: '?0' }, 'senha' : { $regex: '?1' }  }")
	Usuario login(String login, String senha);
	
}
