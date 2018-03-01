package service;

import model.Usuario;
import dao.UsuarioDAO;

public class UsuarioService {
	
	public int validar(Usuario usuario){
		UsuarioDAO dao = new UsuarioDAO();
		return dao.validar(usuario);
	}
}
