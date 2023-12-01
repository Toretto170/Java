package com.derat.deratapp2.repo;

import com.derat.deratapp2.entities.Worksite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorksiteDAO extends JpaRepository<Worksite,Integer> {

    Worksite findWorksiteByCompName(String compName);
}
