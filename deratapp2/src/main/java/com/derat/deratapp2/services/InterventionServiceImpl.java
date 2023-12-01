package com.derat.deratapp2.services;

import com.derat.deratapp2.entities.Intervention;
import com.derat.deratapp2.entities.Worksite;
import com.derat.deratapp2.repo.InterventionDAO;
import com.derat.deratapp2.repo.WorksiteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InterventionServiceImpl implements InterventionServices{

    @Autowired
    private InterventionDAO interventionDAO;
    @Autowired
    private WorksiteDAO worksiteDAO;


    @Override
    public List<Intervention> addIntervention(List<Intervention> interventionList) {
        return interventionDAO.saveAll(interventionList);
    }

    @Override
    public List<Intervention> getInterventionByWorksite(String compName) {
        Worksite w = worksiteDAO.findWorksiteByCompName(compName);
        return interventionDAO.findInterventionByWorksiteId(w.getId());
    }

    @Override
    public List<Intervention> getInterventionByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Intervention> getInterventionByTrapNumber(byte trapsNum, Worksite worksite) {
        return null;
    }
}
