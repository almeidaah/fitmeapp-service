package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Cliente;
import almeida.fernando.fitmeapp.model.Usuario;

@Repository
public interface LoginClienteRepository extends MongoRepository<Cliente, Integer> {

	Usuario findByLoginAndSenha(String login, String senha);
	
}
