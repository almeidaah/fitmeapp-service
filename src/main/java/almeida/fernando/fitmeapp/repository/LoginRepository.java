package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import almeida.fernando.fitmeapp.model.Usuario;

@Repository
public interface LoginRepository extends MongoRepository<Usuario, Integer> {

	//@Query(value= "{ 'codAcademia' : { $regex: '?0' }, 'login' : { $regex: '?1' }, 'senha' : { $regex: '?2' }  }")
	Usuario findByIdAcademiaAndLoginAndSenha(String idAcademia, String login, String senha);
	
}
