package com.sun.drug.controller;

import com.sun.drug.domain.Drugs;
import com.sun.drug.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drug")
public class DrugsController {

    @Autowired
    private DrugsService drugsService;

    @GetMapping("/list/{firstSpelling}")
    public List<Drugs> listDrugs(@PathVariable(value = "firstSpelling") String firstSpelling) {
        return drugsService.listDrugs(firstSpelling);
    }

    @GetMapping("/{id}")
    public Drugs listDrugs(@PathVariable(value = "id") int id) {
        return drugsService.selectDrugs(id);
    }

    @DeleteMapping("/{id}")
    public String deleteDrugs(@PathVariable(value = "id") int id){
        drugsService.deleteDrugs(id);
        return null;
    }

    @PostMapping(value = "/{id}",produces = "application/json")
    public Drugs saveDrugs(@PathVariable(value = "id") int id,@RequestBody Drugs drugs){
        drugs = drugsService.updateDrugs(drugs);
        return drugs;
    }

    @PostMapping(value = "/add/{id}",produces = "application/json")
    public Drugs insertDrugs(@PathVariable(value = "id") int id,@RequestBody Drugs drugs){
        drugsService.saveDrugs(drugs);
        return drugs;
    }

}
