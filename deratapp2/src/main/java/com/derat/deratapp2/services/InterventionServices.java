package com.derat.deratapp2.services;

import com.derat.deratapp2.entities.Intervention;
import com.derat.deratapp2.entities.Worksite;

import java.time.LocalDate;
import java.util.List;

public interface InterventionServices {

    List<Intervention> addIntervention(List<Intervention> interventionList);

    List<Intervention> getInterventionByWorksite(String compName);

    List<Intervention> getInterventionByDate(LocalDate date);

    List<Intervention> getInterventionByTrapNumber(byte trapsNum, Worksite worksite);
}
