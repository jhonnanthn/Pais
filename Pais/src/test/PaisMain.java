package test;

import dao.PaisDAO;
import model.Pais;

public class PaisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaisDAO dao = new PaisDAO();
		Pais pais = new Pais();
		pais.setNome("ssasa");
		pais.setPopulacao(1);
		pais.setArea(221.1);
		dao.createPais(pais);
	}
}
