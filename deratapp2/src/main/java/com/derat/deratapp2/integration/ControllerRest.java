package com.derat.deratapp2.integration;

import com.derat.deratapp2.entities.Intervention;
import com.derat.deratapp2.entities.Worksite;
import com.derat.deratapp2.services.InterventionServices;
import com.derat.deratapp2.services.WorksiteServices;
import com.derat.deratapp2.services.WorksiteServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class ControllerRest {

    @Autowired
    private WorksiteServices worksiteServices;
    @Autowired
    private InterventionServices interventionServices;

    @PostMapping("api/worksite/add/")
    public Worksite addWorksite(@RequestBody Worksite worksite){
        return worksiteServices.addWorksite(worksite);
    }
    @GetMapping("api/worksite/all/")
    public List<Worksite> getAllWorksite(){
        return worksiteServices.getAllWorksite();
    }

    @PostMapping("api/intervention/add/")
    public List<Intervention> newIntervention(@RequestBody List<Intervention> interventionList){
        return interventionServices.addIntervention(interventionList);
    }


}
