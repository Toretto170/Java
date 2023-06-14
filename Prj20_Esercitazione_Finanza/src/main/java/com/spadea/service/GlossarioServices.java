package com.spadea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.spadea.entities.Glossario;
import com.spadea.entities.StandardPoors;
import com.spadea.repo.GlossarioDAO;
import com.spadea.repo.StandardDAO;

@Service
public class GlossarioServices {

	@Autowired
	private GlossarioDAO dao;
	
	@Autowired
	private StandardDAO daoStand;
	
	
	public List<StandardPoors> getStandardPoors(){
		return daoStand.findAll();
	}
	public List<StandardPoors> getStandardPoorsbySector(String sector){
		return daoStand.findByGICSSector(sector);
	}
	
	
	public List<Glossario> getAll(){
		return dao.findAll();
	}
	
	public List<String> getVoci(){
		return dao
				.findAll()
				.stream()
				.map(g -> g.getVoce())
				.toList();
	}
	
	public Glossario getByVoce(String voce){
			return  dao
					.findAll()
					.stream()
					.filter(g-> g.getVoce().equals(voce))
					.toList()
					.get(0);
	}

	public Glossario addNuovaVoce(Glossario g) {
		return dao.save(g);
		
	}
	
	
}
