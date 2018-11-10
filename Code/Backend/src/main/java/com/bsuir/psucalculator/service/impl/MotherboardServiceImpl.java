package com.bsuir.psucalculator.service.impl;

import com.bsuir.model.MotherboardFiltersModel;
import com.bsuir.model.MotherboardModel;
import com.bsuir.psucalculator.converter.MotherboardConverter;
import com.bsuir.psucalculator.entity.MotherboardEntity;
import com.bsuir.psucalculator.repository.MotherboardRepository;
import com.bsuir.psucalculator.service.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherboardServiceImpl implements MotherboardService {

    @Autowired
    private MotherboardRepository motherboardRepository;

    @Override
    public List<MotherboardModel> getMotherboardsByParameters(
            String supportedCpuSocket, String motherboardVendor, String motherboardChipset, String motherboardForm) {

        List<MotherboardEntity> motherboardEntities = motherboardRepository.findAllByParameters(
                supportedCpuSocket, motherboardVendor, motherboardChipset, motherboardForm);

        return MotherboardConverter.toMotherboardModels(motherboardEntities);
    }

    @Override
    public MotherboardFiltersModel getMotherboardFilters() {

        MotherboardFiltersModel motherboardFiltersModel = new MotherboardFiltersModel();

        motherboardFiltersModel.setVendors(motherboardRepository.getVendors());
        motherboardFiltersModel.setChipsets(motherboardRepository.getChipsets());
        motherboardFiltersModel.setForms(motherboardRepository.getForms());

        return motherboardFiltersModel;
    }
}
