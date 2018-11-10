package com.bsuir.psucalculator.service.impl;

import com.bsuir.model.CentralProcessingUnitFiltersModel;
import com.bsuir.model.CentralProcessingUnitModel;
import com.bsuir.psucalculator.converter.CentralProcessingUnitConverter;
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
    public List<CentralProcessingUnitModel> getProcessorsByParameters(
            String cpuVendor, String cpuFamily, String cpuSocket) {

        List<CentralProcessingUnitEntity> centralProcessingUnitEntities =
                centralProcessingUnitRepository.findAllByParameters(cpuVendor, cpuFamily, cpuSocket);

        return CentralProcessingUnitConverter.toCentralProcessingUnitModels(centralProcessingUnitEntities);
    }

    @Override
    public CentralProcessingUnitFiltersModel getProcessorFilters() {

        CentralProcessingUnitFiltersModel centralProcessingUnitFiltersModel = new CentralProcessingUnitFiltersModel();

        centralProcessingUnitFiltersModel.setFamilies(centralProcessingUnitRepository.getFamilies());
        centralProcessingUnitFiltersModel.setVendors(centralProcessingUnitRepository.getVendors());
        centralProcessingUnitFiltersModel.setSockets(centralProcessingUnitRepository.getSockets());

        return centralProcessingUnitFiltersModel;
    }
}
