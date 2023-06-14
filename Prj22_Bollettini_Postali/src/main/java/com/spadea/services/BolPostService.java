package com.spadea.services;

import java.util.List;

import com.spadea.entities.Bollettino;
import com.spadea.entities.ContoCorrente;

public interface BolPostService {

	ContoCorrente getContoCorrentebyCodiceConto(long codiceConto);
	List<ContoCorrente> getContiCorrenti();
	ContoCorrente addContoCorrente(ContoCorrente c);
	List<Bollettino> getBollettini();
	Bollettino addBollettino(Bollettino b);
	Bollettino getBollettinobyId(String codiceBollettino);
}
