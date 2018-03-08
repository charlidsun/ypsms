package com.sun.drug.controller;

import com.sun.drug.domain.Drugs;
import com.sun.drug.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/mvc")
public class DrugsMvcController {

    @Autowired
    private DrugsService drugsService;

    @RequestMapping(value="/{spellings}",method = RequestMethod.GET)
    public ModelAndView listDrugs(@PathVariable(value = "spellings") String spellings){

        List<Drugs> list = drugsService.listDrugs(spellings);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("drugs");
        return modelAndView;
    }

}
