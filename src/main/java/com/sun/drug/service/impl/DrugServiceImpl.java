package com.sun.drug.service.impl;

import com.sun.drug.domain.Drugs;
import com.sun.drug.repository.DrugsRepository;
import com.sun.drug.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugsService {

    @Autowired
    DrugsRepository drugsRepository;

    @Override
    public List<Drugs> listDrugs(String firstSpelling) {
        return drugsRepository.listDrugs(firstSpelling);
    }

    @Override
    public Drugs selectDrugs(int id) {
        return drugsRepository.selectDrugs(id);
    }

    @Override
    public void deleteDrugs(int id) {
        drugsRepository.deleteDrugs(id);
    }

    @Override
    public Drugs updateDrugs(Drugs drugs) {
        return drugsRepository.updateDrugs(drugs);
    }

    @Override
    public void saveDrugs(Drugs drugs) {
        drugsRepository.saveDrugs(drugs);
    }
}
