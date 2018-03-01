package service;

import java.util.ArrayList;

import dao.PaisDAO;
import model.Pais;

public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public int createPais(Pais pais) {
		return dao.createPais(pais);
	}

	public Pais loadPais(Pais pais){
		Pais to = dao.loadPais(pais);
		return to;
	}
	
	public void updatePais(Pais pais){
		dao.updatePais(pais);
	}
	
	public void deletePais(Pais pais){
		dao.deletePais(pais);
	}
	
	public ArrayList<Pais> listarPais(){
		return dao.listarPais();
	}
	
	public ArrayList<Pais> listarClientes(String chave){
		return dao.listarPais(chave);
	}
}
