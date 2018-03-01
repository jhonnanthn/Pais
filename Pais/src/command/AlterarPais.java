package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

public class AlterarPais implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		String pPopulacao = request.getParameter("populacao");
		String pArea = request.getParameter("area");
		
		
		Pais pais = new Pais(Integer.parseInt(pId), pNome, Long.parseLong(pPopulacao), Double.parseDouble(pArea));
		
		PaisService cs = new PaisService();

		RequestDispatcher view = null;

		cs.updatePais(pais);
		request.setAttribute("pais", pais);
		view = request.getRequestDispatcher("Pais.jsp");

		view.forward(request, response);

	}
}
