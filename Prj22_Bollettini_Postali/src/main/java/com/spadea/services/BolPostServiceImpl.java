package com.spadea.services;

import java.util.List;

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
	public ContoCorrente getContoCorrentebyCodiceConto(long codiceConto) {
		// TODO Auto-generated method stub
		return ccDao.getReferenceById(codiceConto);
	}

	@Override
	public List<ContoCorrente> getContiCorrenti() {
		// TODO Auto-generated method stub
		return ccDao.findAll();
	}

	@Override
	public ContoCorrente addContoCorrente(ContoCorrente c) {
		
		return ccDao.save(c);
	}

	@Override
	public List<Bollettino> getBollettini() {
		// TODO Auto-generated method stub
		return bolDao.findAll();
	}

	@Override
	public Bollettino addBollettino(Bollettino b) {
		if (getContoCorrentebyCodiceConto(b.getCodiceContoDestinatario())!=null) {
			return bolDao.save(b);			
		}
		return null;
	}

	@Override
	public Bollettino getBollettinobyId(String codiceBollettino) {
		// TODO Auto-generated method stub
		return bolDao.getReferenceById(codiceBollettino);
	}

}
