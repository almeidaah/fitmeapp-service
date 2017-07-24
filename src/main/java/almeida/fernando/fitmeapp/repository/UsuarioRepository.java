package almeida.fernando.fitmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import almeida.fernando.fitmeapp.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {


}
