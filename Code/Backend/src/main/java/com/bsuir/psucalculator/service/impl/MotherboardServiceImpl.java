package com.bsuir.psucalculator.service.impl;

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
    public List<MotherboardEntity> getMotherboardsByParameters(String supportedCpuSocket,
                                                               String motherboardVendor,
                                                               String motherboardChipset,
                                                               String motherboardForm) {

        return null;
    }
}
