package com.spadea.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spadea.entities.Glossario;
import com.spadea.service.GlossarioServices;

@Controller
public class ControllerMVC {

	@Autowired
	private GlossarioServices service;
	
	@GetMapping({"/","/home","/index","/prima"})
	public String home(Model m) {
		m.addAttribute("titolo","prima pagina" );
		return "home";
	}
	
	/**
	 * Serve per mostrare la vista col modulo per aggiunger voci
	 * @return
	 */
	@GetMapping("voci/add")
	public String addView(Model m) {
		m.addAttribute("titolo","Aggiungi una nuova voce");
		return "form";
	}
	/**
	 * Serve per mostrare la vista col modulo per aggiunger voci
	 * @return
	 */
	@GetMapping("glossario")
	public String tabGlossario(Model m) {
		m.addAttribute("titolo","Tabella glossario");
		m.addAttribute("col1","Voce");
		m.addAttribute("col2","Descrizione");
		m.addAttribute("voci",service.getAll());
		return "glossario";
	}
	@GetMapping("standard")
	public String tabStandard(Model m) {
		m.addAttribute("titolo","Tabella standard");
		m.addAttribute("col1","Nome");
		m.addAttribute("col2","Anno di Fondazione");
		m.addAttribute("voci",service.getStandardPoors());
		return "standard";
	}
	/**
	 * Azione per aggiungere nuove voci
	 * @param g
	 * @return
	 */
	@PostMapping("/voci")
	public String addVoce(Glossario g) {
		service.addNuovaVoce(g);
		return "redirect:/home";
	}
}
