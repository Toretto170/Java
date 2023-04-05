package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import repo.GameDAO;

@WebServlet("/giochi")
public class GamesREST extends HttpServlet {
	
	GameDAO dao = new GameDAO();
	
	
	
}
