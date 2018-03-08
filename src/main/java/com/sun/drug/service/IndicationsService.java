package com.sun.drug.service;

import com.sun.drug.domain.Indications;

import java.util.List;

public interface IndicationsService {

    List<Indications> listIndiction();

    Indications selectIndication(int id);
}
