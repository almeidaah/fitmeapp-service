package almeida.fernando.fitmeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import almeida.fernando.fitmeapp.model.Usuario;
import almeida.fernando.fitmeapp.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public Usuario login(Integer codAcademia, String login, String senha) {
		return loginRepository.findByCodAcademiaAndLoginAndSenha(codAcademia, login, senha);
	}
	
	
	
}
