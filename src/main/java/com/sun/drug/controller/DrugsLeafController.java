package com.sun.drug.controller;

import com.sun.drug.domain.Drugs;
import com.sun.drug.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/leaf")
public class DrugsLeafController {

    @Autowired
    private DrugsService drugsService;

    @GetMapping(value={"/{spellings}"})
    public String listDrugs(Model model, @PathVariable(value = "spellings") String spellings){
        if(spellings == null){
            spellings = "";
        }

        List<Drugs> list = drugsService.listDrugs(spellings);
        model.addAttribute("list",list);
        return "drugList";
    }

}
