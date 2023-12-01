package com.derat.deratapp2.entities;

import jakarta.persistence.*;

import java.util.List;

/**
 * This Class represents ech worksite */
@Entity
public class Worksite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String compName;
    @OneToMany(mappedBy = "worksite",cascade = CascadeType.ALL)
    private List<Intervention> interventions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public List<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(List<Intervention> interventions) {
        this.interventions = interventions;
    }
}
