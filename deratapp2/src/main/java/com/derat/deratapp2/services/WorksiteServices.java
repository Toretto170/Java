package com.derat.deratapp2.services;

import com.derat.deratapp2.entities.Worksite;

import java.util.List;

public interface WorksiteServices {

    Worksite addWorksite(Worksite worksite);
    Worksite removeWorksite(Worksite worksite);
    List<Worksite> getAllWorksite();
    List<Worksite> addManyWorksites(List<Worksite> worksiteList);

}
