package com.derat.deratapp2.repo;

import com.derat.deratapp2.entities.Intervention;
import com.derat.deratapp2.entities.Worksite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface InterventionDAO extends JpaRepository<Intervention,Integer> {

}
