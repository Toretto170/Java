package com.spadea.services;

import java.util.List;
import java.util.Optional;

import com.spadea.entities.Bollettino;
import com.spadea.entities.ContoCorrente;

public interface BolPostService {

	Optional<ContoCorrente> getContoCorrentebyCodiceConto(long codiceConto);
	List<ContoCorrente> getContiCorrenti();
	ContoCorrente addContoCorrente(ContoCorrente c);
	List<Bollettino> getBollettini();
	Bollettino addBollettino(Bollettino b);
	Bollettino getBollettinobyId(String codiceBollettino);
	List<ContoCorrente> addContiCorrenti(List<ContoCorrente> c);
}
