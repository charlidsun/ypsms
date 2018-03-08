package com.sun.drug.controller;

import com.sun.drug.domain.Indications;
import com.sun.drug.service.IndicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/indication")
public class IndicationsController {

    @Autowired
    IndicationsService indicationsService;

    @GetMapping("/")
    public List<Indications> listIndications(){
        return indicationsService.listIndiction();
    }
}
