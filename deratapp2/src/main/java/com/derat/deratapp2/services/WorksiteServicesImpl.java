package com.derat.deratapp2.services;

import com.derat.deratapp2.entities.Worksite;
import com.derat.deratapp2.repo.WorksiteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorksiteServicesImpl implements  WorksiteServices{

    @Autowired
    private WorksiteDAO worksiteDAO;
    @Override
    public Worksite addWorksite(Worksite worksite) {
        return worksiteDAO.save(worksite);
    }

    /* TODO
    *   Handle the remove method via frontend
    *   add a method to recover the correct id given the company name*/
    public Worksite removeWorksite(Worksite worksite) {
        worksiteDAO.delete(worksite);
        return  worksite;
    }

    @Override
    public List<Worksite> getAllWorksite() {
        return worksiteDAO.findAll();
    }

    @Override
    public List<Worksite> addManyWorksites(List<Worksite> worksiteList) {
        return worksiteDAO.saveAll(worksiteList);
    }
}
