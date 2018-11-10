package com.bsuir.psucalculator.service;

import com.bsuir.psucalculator.entity.CentralProcessingUnitEntity;

import java.util.List;

public interface CentralProcessingUnitService {

    List<CentralProcessingUnitEntity> getProcessorsByParameters(String cpuVendor, String cpuFamily, String cpuSocket);
}
