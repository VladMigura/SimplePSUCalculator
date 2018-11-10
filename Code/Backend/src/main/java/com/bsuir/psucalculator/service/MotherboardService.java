package com.bsuir.psucalculator.service;

import com.bsuir.psucalculator.entity.MotherboardEntity;

import java.util.List;

public interface MotherboardService {

    List<MotherboardEntity> getMotherboardsByParameters(String supportedCpuSocket,
                                                        String motherboardVendor,
                                                        String motherboardChipset,
                                                        String motherboardForm);
}
