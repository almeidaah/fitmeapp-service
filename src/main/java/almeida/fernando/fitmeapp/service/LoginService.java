package almeida.fernando.fitmeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.repository.ClienteRepository;
import almeida.fernando.fitmeapp.repository.InstrutorRepository;

@Service
@Transactional
public class LoginService {

	@Autowired
	private ClienteRepository loginClienteRepository;
	
	@Autowired
	private InstrutorRepository loginInstrutorRepository;
	
	public Usuario loginCliente(String login, String senha) {
		return loginClienteRepository.findByLoginAndSenha(login, senha);
	}
	
	public Usuario loginInstrutor(String login, String senha) {
		return loginInstrutorRepository.findByLoginAndSenha(login, senha);
	}
	
	
	
	
}
