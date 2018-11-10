package com.bsuir.psucalculator.service;

import com.bsuir.model.CentralProcessingUnitFiltersModel;
import com.bsuir.model.CentralProcessingUnitModel;

import java.util.List;

public interface CentralProcessingUnitService {

    List<CentralProcessingUnitModel> getProcessorsByParameters(String cpuVendor, String cpuFamily, String cpuSocket);
    CentralProcessingUnitFiltersModel getProcessorFilters();
}
