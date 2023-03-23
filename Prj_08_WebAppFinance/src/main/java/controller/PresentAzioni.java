package controller;

import java.io.IOException;

import fakeDB.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/azioni")
public class PresentAzioni extends HttpServlet{
	
	Portafoglio portafoglio;
	
	public PresentAzioni() {
		this.portafoglio= new Portafoglio("Alvise");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		request.setAttribute("titoloPagina","Le nostre azioni top");
		request.setAttribute("elencoAzioni", Database.titoloAzionari);
		// inizio pagin
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		request.getRequestDispatcher("lista.jsp").include(request, response);
		// pie di pagina
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
}
