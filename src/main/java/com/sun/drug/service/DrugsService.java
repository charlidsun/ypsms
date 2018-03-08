package com.sun.drug.service;

import com.sun.drug.domain.Drugs;

import java.util.List;

public interface DrugsService {

    List<Drugs> listDrugs(String firstSpelling);

    Drugs selectDrugs(int id);

    void deleteDrugs(int id);

    Drugs updateDrugs(Drugs drugs);

    void saveDrugs(Drugs drugs);
}
