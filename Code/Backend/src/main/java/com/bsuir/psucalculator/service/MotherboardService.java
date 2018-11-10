package com.bsuir.psucalculator.service;

import com.bsuir.model.MotherboardFiltersModel;
import com.bsuir.model.MotherboardModel;

import java.util.List;

public interface MotherboardService {

    List<MotherboardModel> getMotherboardsByParameters(String supportedCpuSocket,
                                                       String motherboardVendor,
                                                       String motherboardChipset,
                                                       String motherboardForm);

    MotherboardFiltersModel getMotherboardFilters();
}
