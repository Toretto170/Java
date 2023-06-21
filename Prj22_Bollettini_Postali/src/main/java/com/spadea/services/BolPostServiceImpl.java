package com.spadea.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spadea.entities.Bollettino;
import com.spadea.entities.ContoCorrente;
import com.spadea.repo.BollettinoDAO;
import com.spadea.repo.ContoCorrenteDAO;

@Service
public class BolPostServiceImpl implements BolPostService {

	@Autowired
	private BollettinoDAO bolDao;
	@Autowired
	private ContoCorrenteDAO ccDao;
	
	@Override
	public Optional<ContoCorrente> getContoCorrentebyCodiceConto(long codiceConto) {
		
		return ccDao.findById(codiceConto);
	}

	@Override
	public List<ContoCorrente> getContiCorrenti() {
		
		return ccDao.findAll();
	}

	@Override
	public ContoCorrente addContoCorrente(ContoCorrente c) {
		
		return ccDao.save(c);
	}

	@Override
	public List<Bollettino> getBollettini() {
		
		return bolDao.findAll();
	}

	@Override
	public Bollettino addBollettino(Bollettino b) {
		Optional<ContoCorrente> c = getContoCorrentebyCodiceConto(b.getCodiceContoDestinatario());
		if(c.isEmpty() == false) {
			
			return bolDao.save(b);
		}
		
		return null;
	}

	@Override
	public Bollettino getBollettinobyId(String codiceBollettino) {
		
		return bolDao.findByCodiceBollettino(codiceBollettino);
	}


	@Override
	public List<ContoCorrente> addContiCorrenti(List<ContoCorrente> c) {
		
		return ccDao.saveAll(c);
	}

}
