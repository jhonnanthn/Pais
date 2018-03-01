package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

public class DeletarPais implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		
		
		Pais pais = new Pais(Integer.parseInt(pId), pNome);
		
		PaisService cs = new PaisService();

		RequestDispatcher view = null;

		cs.deletePais(pais);
		request.setAttribute("pais", pais);
		view = request.getRequestDispatcher("Pais.jsp");

		view.forward(request, response);

	}
}
