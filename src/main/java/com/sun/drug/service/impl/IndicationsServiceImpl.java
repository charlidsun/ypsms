package com.sun.drug.service.impl;

import com.sun.drug.domain.Indications;
import com.sun.drug.repository.IndicationRepository;
import com.sun.drug.service.IndicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndicationsServiceImpl implements IndicationsService{

    @Autowired
    IndicationRepository indicationRepository;

    @Override
    public List<Indications> listIndiction() {
        return indicationRepository.listIndications();
    }

    @Override
    public Indications selectIndication(int id) {
        return indicationRepository.selectIndications(id);
    }
}
