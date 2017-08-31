package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Instrutor;
import almeida.fernando.fitmeapp.model.Usuario;

@Repository
public interface InstrutorRepository extends MongoRepository<Instrutor, Integer> {

	Usuario findByLoginAndSenha(String login, String senha);
	
}
