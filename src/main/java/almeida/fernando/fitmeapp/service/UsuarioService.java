package almeida.fernando.fitmeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Cliente;
import almeida.fernando.fitmeapp.model.Instrutor;
import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.repository.ClienteRepository;
import almeida.fernando.fitmeapp.repository.InstrutorRepository;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	private InstrutorRepository instrutorRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void saveInstrutor(Usuario usuario) {
		if(usuario.getId() != null){
			instrutorRepository.save((Instrutor)usuario);
		}else{
			instrutorRepository.insert((Instrutor)usuario);
		}
		
	}

	public void saveCliente(Usuario usuario) {
		if(usuario.getId() != null){
			clienteRepository.save((Cliente)usuario);
		}else{
			clienteRepository.insert((Cliente)usuario);
		}
		
	}

	public List<? extends Usuario> listAll(boolean instrutores) {
		if(instrutores){
			return instrutorRepository.findAll();
		}
		return clienteRepository.findAll();
	}

}
