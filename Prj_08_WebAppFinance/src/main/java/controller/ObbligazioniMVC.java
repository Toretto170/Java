package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/obbligazioni")
public class ObbligazioniMVC extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("titoloPagina","Le nostre obbligazioni top");
		// inizio pagin
				request.getRequestDispatcher("header.jsp").include(request, response);
				request.getRequestDispatcher("menu.jsp").include(request, response);
				
				request.getRequestDispatcher("lista.jsp").include(request, response);
				// pie di pagina
				request.getRequestDispatcher("footer.jsp").include(request, response);
	}
	
	
	
}
