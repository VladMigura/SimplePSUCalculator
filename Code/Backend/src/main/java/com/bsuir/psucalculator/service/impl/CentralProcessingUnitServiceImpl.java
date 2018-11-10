package com.bsuir.psucalculator.service.impl;

import com.bsuir.psucalculator.entity.CentralProcessingUnitEntity;
import com.bsuir.psucalculator.repository.CentralProcessingUnitRepository;
import com.bsuir.psucalculator.service.CentralProcessingUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentralProcessingUnitServiceImpl implements CentralProcessingUnitService {

    @Autowired
    private CentralProcessingUnitRepository centralProcessingUnitRepository;

    @Override
    public List<CentralProcessingUnitEntity> getProcessorsByParameters(String cpuVendor,
                                                                       String cpuFamily,
                                                                       String cpuSocket) {

        return null;
    }
}
