package com.spadea.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spadea.services.ViaggiService;

@Controller
@RequestMapping("")
public class ControllerMVC {

	@Autowired
	private ViaggiService service;
	
	@GetMapping(value = {"viaggi","tratte"})
		String getViaggi(Model m){
		m.addAttribute("Titolo","Pagina Elenco Viaggi");
		m.addAttribute("Viaggi", service.getViaggi());
		return "elencoViaggi";
	}
	@GetMapping(value = {"prenotazioni","conferme"})
		String getPrenotazioni(Model m){
		m.addAttribute("Titolo","Pagina Elenco Prenotazioni");
		return "elencoPrenotazioni";
	}
	@GetMapping("login")
	String login(Model m){
	m.addAttribute("Titolo","login");
	return "login";
}
	@GetMapping("dettaglio/{id}")
	String dettaglio(Model m, @PathVariable int id){
	m.addAttribute("Titolo","Pagina Elenco Dettagli");
	m.addAttribute("Viaggio", service.getPrenotazioneById(id));
	return "dettaglio";
}
	
	@PostMapping("login")
	String doLogin(@RequestParam String username,String password) {
		if(username.equals("Luca")&&password.equals("12345")) {
			
			return "redirect:viaggi";
		}
		
		return "redirect:login";
	}
}
