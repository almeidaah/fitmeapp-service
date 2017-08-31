package almeida.fernando.fitmeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.repository.LoginClienteRepository;
import almeida.fernando.fitmeapp.repository.LoginInstrutorRepository;

@Service
@Transactional
public class LoginService {

	@Autowired
	private LoginClienteRepository loginClienteRepository;
	
	@Autowired
	private LoginInstrutorRepository loginInstrutorRepository;
	
	public Usuario loginCliente(String login, String senha) {
		return loginClienteRepository.findByLoginAndSenha(login, senha);
	}
	
	public Usuario loginInstrutor(String login, String senha) {
		return loginInstrutorRepository.findByLoginAndSenha(login, senha);
	}
	
	
	
	
}
